package mx.tecnm.rioverde.dao;
import java.io.FileReader;
import mx.tecnm.rioverde.models.Prorroga;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import org.h2.tools.RunScript;
/**
 *
 * @author Gael Perez
 */
public class ProrrogaDao {

    public Connection conectar() {
        String database = "sistemaCaja";
        String user = "sa";
        String password = "";
        
        String dataFolder = System.getenv("APPDATA");

        String dbFile = dataFolder + "\\SistemaCaja\\database\\sistemaCaja"; // Archivo de base de datos H2
        String scriptFile = "database\\sistemaCaja.sql";

        Connection connection = null;
        try {
            // Conectar a la base de datos H2 en modo embebido
            String conexionUrl = "jdbc:h2:" + dbFile;
            connection = DriverManager.getConnection(conexionUrl, user, password);

            // Ejecutar el script SQL para crear tablas y cargar datos
            RunScript.execute(connection, new FileReader(scriptFile));

        } catch (SQLException e) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }

    public boolean agregar (Prorroga prorroga) {

        try {
            String sql;
            if (prorroga.getFechaLiq() != null){
                sql = "insert into prorroga (semestrePorPagar, fechaPedido,  fechaLiq, totalPorPagar, totalPagado, restoPorPagar, noControl, concepto) VALUES ('" + prorroga.getSemestrePorPagar() + "', DATE '" + prorroga.getFechaPedido() + "', DATE '" + prorroga.getFechaLiq() + "', " + prorroga.getTotalPorPagar() + ", " + prorroga.getTotalPorPagar() + ", 0, " + prorroga.getNoControl() + ", '" + prorroga.getConcepto()+ "');";
            } else {
                sql = "insert into prorroga (semestrePorPagar, fechaPedido, totalPorPagar, totalPagado, restoPorPagar, noControl, concepto) VALUES ('" + prorroga.getSemestrePorPagar() + "', DATE '" + prorroga.getFechaPedido() + "', " + prorroga.getTotalPorPagar() + ", 0, " + prorroga.getTotalPorPagar() + ", " + prorroga.getNoControl() + ", '" + prorroga.getConcepto()+ "');";
            }
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void editar (Prorroga prorroga) {

        try {
            String sql = "update prorroga set semestrePorPagar = '" + prorroga.getSemestrePorPagar() + "', fechaPedido = '" + prorroga.getFechaPedido() + "', fechaLiq = '" + prorroga.getFechaLiq() + "', totalPorPagar = '" + prorroga.getTotalPorPagar() + "', noControl = '" + prorroga.getNoControl() + "', concepto = '" + prorroga.getConcepto() + "' where idProrroga = " + prorroga.getIdProrroga();
            Statement statement = conectar().createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Prorroga> listar () {

        List<Prorroga> listado = new ArrayList<>();


        try {
            String sql = "select * from prorroga";
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Prorroga prorroga = new Prorroga();
                prorroga.setIdProrroga(resultado.getInt("idProrroga"));
                prorroga.setSemestrePorPagar(resultado.getString("semestrePorPagar"));
                prorroga.setFechaPedido(resultado.getString("fechaPedido"));
                prorroga.setFechaLiq(resultado.getString("fechaLiq"));
                prorroga.setTotalPorPagar(resultado.getInt("totalPorPagar"));
                prorroga.setTotalPagado(resultado.getInt("totalPagado"));
                prorroga.setRestoPorPagar(resultado.getInt("restoPorPagar"));
                prorroga.setNoControl(resultado.getInt("noControl"));
                prorroga.setConcepto(resultado.getString("Concepto"));
                listado.add(prorroga);
            }

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;

    }
    
    public List<Prorroga> listar (String Cbox, String condicion, int typeCase) {

        List<Prorroga> listado = new ArrayList<>();
        
        /*
        Coincide
        Comienza con
        Termina con
        Incluye
        */
        
        try {
            String sql;
            switch (typeCase){
                case 0: {
                    sql = "select * from prorroga where " + Cbox + " = '" + condicion + "'";
                    break;
                }
                case 1: {
                    sql = "select * from prorroga where " + Cbox + " LIKE '" + condicion + "%';";
                    break;
                }
                case 2: {
                    sql = "select * from prorroga where " + Cbox + " LIKE '%" + condicion + "';";
                    break;
                }
                case 3: {
                    sql = "select * from prorroga where " + Cbox + " LIKE '%" + condicion + "%';";
                    break;
                }
                default: sql = "select * from prorroga where " + Cbox + " = '" + condicion + "'";
            }
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            while (resultado.next()) {
                Prorroga prorroga = new Prorroga();
                prorroga.setIdProrroga(resultado.getInt("idProrroga"));
                prorroga.setSemestrePorPagar(resultado.getString("semestrePorPagar"));
                prorroga.setFechaPedido(resultado.getString("fechaPedido"));
                prorroga.setFechaLiq(resultado.getString("fechaLiq"));
                prorroga.setTotalPorPagar(resultado.getInt("totalPorPagar"));
                prorroga.setTotalPagado(resultado.getInt("totalPagado"));
                prorroga.setRestoPorPagar(resultado.getInt("restoPorPagar"));
                prorroga.setNoControl(resultado.getInt("noControl"));
                prorroga.setConcepto(resultado.getString("Concepto"));
                listado.add(prorroga);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
        
    }

    public boolean eliminar (Prorroga prorroga) {

        try {
            String sql = "delete from prorroga where idProrroga = " + prorroga.getIdProrroga();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public List<Integer> eliminar (int[] array) {
        List<Integer> numInPagos = new ArrayList<>();
        try {

            String csvString = Arrays.toString(array) // convierto los numeros seleccionados a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");

            Statement statement = conectar().createStatement();
            
            String inProrroga = "select DISTINCT prorroga.idProrroga from prorroga, pago WHERE prorroga.idProrroga IN (" + csvString + ") and prorroga.idProrroga = pago.idProrroga";
            // busco los valores que no se pueden borrar
            ResultSet res = statement.executeQuery(inProrroga);

            int j = 0;
            while (res.next()) {
                if (res.getInt("idProrroga") != 0){
                    numInPagos.add(res.getInt("idProrroga"));
                }
                j++;
            }

            int[] pagos = numInPagos.stream().mapToInt(Integer::intValue).toArray();
            
            int [] re = removeElementsFromArray(array, pagos);

            String csv = Arrays.toString(re) // convierto la array de los numeros que si se pueden borrar a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");

            String sql = "DELETE FROM prorroga WHERE idProrroga IN (" + csv + ");"; // borro los numeros que si se pueden borrar
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numInPagos;
    }

    private static int[] removeElementsFromArray(int[] arr1, int[] arr2) {
        
        int [] re = new int [arr1.length - arr2.length];
        
        // Crear un HashSet con los elementos de arr2 para una búsqueda eficiente
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }

        // Usar un índice para mantener el seguimiento de la posición válida en el nuevo array
        int validIndex = 0;

        // Iterar sobre arr1 y copiar solo los elementos que no están en arr2 al nuevo array
        for (int num : arr1) {
            if (!set.contains(num)) {
                re[validIndex] = num;
                validIndex++;
            }
        }

        return re;

    }
    
    public List<Prorroga> getProrrogasActivas(String noControl) {
        List<Prorroga> listado = new ArrayList<>();

        try {
            String sql = "SELECT * FROM PRORROGA WHERE NOCONTROL = " + noControl + " AND FECHALIQ IS NULL";
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Prorroga prorroga = new Prorroga();
                prorroga.setIdProrroga(resultado.getInt("idProrroga"));
                prorroga.setSemestrePorPagar(resultado.getString("semestrePorPagar"));
                prorroga.setFechaPedido(resultado.getString("fechaPedido"));
                prorroga.setFechaLiq(resultado.getString("fechaLiq"));
                prorroga.setTotalPorPagar(resultado.getInt("totalPorPagar"));
                prorroga.setTotalPagado(resultado.getInt("totalPagado"));
                prorroga.setRestoPorPagar(resultado.getInt("restoPorPagar"));
                prorroga.setNoControl(resultado.getInt("noControl"));
                prorroga.setConcepto(resultado.getString("Concepto"));
                listado.add(prorroga);
            }

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;
    }

    public void editarPagadoResto (int pagado, int idProrroga) {

        try {
            
            String sql = "update PRORROGA set TOTALPAGADO = " + pagado + ", RESTOPORPAGAR = TOTALPORPAGAR - " + pagado + " where IDPRORROGA = " + idProrroga;
            Statement statement = conectar().createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public int obtenerRestoPorPagar (int idProrroga){
        int total = 0;

        try {
            String sql = "select RESTOPORPAGAR from PRORROGA where IDPRORROGA = " + idProrroga;
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                total = resultado.getInt("RESTOPORPAGAR");
            }

        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total;
    }
    
    public void setLiquidado (String fecha, int idProrroga) {

        try {
            
            String sql = "update PRORROGA set FECHALIQ = '" + fecha + "' where IDPRORROGA = " + idProrroga;
            Statement statement = conectar().createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
