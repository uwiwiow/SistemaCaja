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

        String dbFile = ".\\src\\main\\java\\DB\\" + database + ".h2.db"; // Archivo de base de datos H2
        String scriptFile = "src\\main\\java\\DB\\sistemaCaja.sql";

        Connection connection = null;
        try {
            // Conectar a la base de datos H2 en modo embebido
            String conexionUrl = "jdbc:h2:" + dbFile;
            connection = DriverManager.getConnection(conexionUrl, user, password);

            // Ejecutar el script SQL para crear tablas y cargar datos
            RunScript.execute(connection, new FileReader(scriptFile));

        } catch (SQLException e) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }

    public boolean agregar (Prorroga prorroga) {

        try {
            String sql;
            if (prorroga.getFechaLiq() != null){
                sql = "insert into prorroga (semestrePorPagar, fechaPedido,  fechaLiq, totalPorPagar, noControl, concepto) VALUES ('" + prorroga.getSemestrePorPagar() + "', DATE '" + prorroga.getFechaPedido() + "', DATE '" + prorroga.getFechaLiq() + "', " + prorroga.getTotalPorPagar() + ", " + prorroga.getNoControl() + ", '" + prorroga.getConcepto()+ "');";
            } else {
                sql = "insert into prorroga (semestrePorPagar, fechaPedido, totalPorPagar, noControl, concepto) VALUES ('" + prorroga.getSemestrePorPagar() + "', DATE '" + prorroga.getFechaPedido() + "', " + prorroga.getTotalPorPagar() + "," + prorroga.getNoControl() + ", '" + prorroga.getConcepto()+ "');";
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
            
            removeElementsFromArray(array, pagos);

            String csv = Arrays.toString(array) // convierto la array de los numeros que si se pueden borrar a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");

            String sql = "DELETE FROM prorroga WHERE idProrroga IN (" + csv + ");"; // borro los numeros que si se pueden borrar
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numInPagos;
    }

    private static void removeElementsFromArray(int[] arr1, int[] arr2) {
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
                arr1[validIndex] = num;
                validIndex++;
            }
        }
        
        // Rellenar el resto del array con ceros (o algún otro valor de relleno si es necesario)
        while (validIndex < arr1.length) {
            arr1[validIndex] = 0; // O cualquier otro valor de relleno que desees
            validIndex++;
        }
    }
    
    public void guardar(Prorroga prorroga) {

        if (prorroga.getIdProrroga() == 0) {
            agregar(prorroga);
        } else {
            editar(prorroga);
        }

    }

}
