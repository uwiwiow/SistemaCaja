package mx.tecnm.rioverde.dao;
import java.io.FileReader;
import mx.tecnm.rioverde.models.Pago;
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
public class PagoDao {
    
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
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
        
    public boolean agregar (Pago pago) {

        try {
            String sql = "insert into pago (idPago, abonoPago, numeroPago, fechaPago, idProrroga) values (" + pago.getIdPago() + ", " + pago.getAbonoPago() + ", " + pago.getNumeroPago() + ", '" + pago.getFechaPago() + "', " + pago.getIdProrroga() + ");";
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void editar (Pago pago) {

        try {
            String sql = "update pago set idPago = " + pago.getIdPago() + ", abonoPago = " + pago.getAbonoPago() + ", numeroPago = " + pago.getNumeroPago() + ", fechaPago = " + pago.getFechaPago() + ", idProrroga = " + pago.getIdProrroga() + " where idPago = " + pago.getIdPago();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Pago> listar () {

        List<Pago> listado = new ArrayList<>();
        
        
        try {
            String sql = "select * from pago";
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            while (resultado.next()) {
                Pago pago = new Pago();
                pago.setIdPago(resultado.getInt("idPago"));
                pago.setAbonoPago(resultado.getInt("abonoPago"));
                pago.setNumeroPago(resultado.getInt("numeroPago"));
                pago.setFechaPago(resultado.getString("fechaPago"));
                pago.setIdProrroga(resultado.getInt("idProrroga"));
                listado.add(pago);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
        
    }
    
    public boolean eliminar (Pago pago) {

        try {
            String sql = "delete from pago where IdPago = " + pago.getIdPago();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean eliminar (int[] array) {
        try {

            String csvString = Arrays.toString(array) // convierto los numeros seleccionados a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");

            Statement statement = conectar().createStatement();
            
            String sql = "DELETE FROM prorroga WHERE idProrroga IN (" + csvString + ");";
            statement.execute(sql);

            return true;
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public void guardar(Pago pago) {
        
        if (pago.getIdPago() == 0) {
            agregar(pago);
        } else {
            editar(pago);
        }
        
    }
    
    public int getNextNumPago(int idProrroga) {
        int next = 0;

        try {
            String sql = "select max(NUMEROPAGO) as maxNumPago from PAGO where IDPRORROGA = " + idProrroga;
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                int maxNumPago = resultado.getInt("maxNumPago");
                if (maxNumPago >= 1) {
                    next = maxNumPago + 1;
                } else {
                    next = 1;
                }
            } else {
                next = 1;
            }

        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return next;
    }

    
    public int calculatePagadoRestoProrroga(int idProrroga) {
        int total = 0;

        try {
            String sql = "select sum(PAGO.ABONOPAGO) as totalPagado from PAGO where PAGO.IDPRORROGA = " + idProrroga;
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                total = resultado.getInt("totalPagado");
            }

        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total;
    }

    
}
