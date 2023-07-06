package mx.tecnm.rioverde.dao;
import mx.tecnm.rioverde.models.Pago;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author Gael Perez
 */
public class PagoDao {
    
    public Connection conectar () {
        String database = "sistemaCaja";
        String user = "root";
        String password = "root";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";
        Connection conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, user, password);
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
        
    public void agregar (Pago pago) {

        try {
            String sql = "insert into pago (idPago, abonoPago, totalPagado, restoPorPagar, numeroPago, fechaPago, idProrroga) values (" + pago.getIdPago() + ", " + pago.getAbonoPago() + ", " + pago.getTotalPagado() + ", " + pago.getRestoPorPagar() + ", " + pago.getNumeroPago() + ", " + pago.getFechaPago() + ", " + pago.getIdProrroga() + ");";
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editar (Pago pago) {

        try {
            String sql = "update pago set idPago = " + pago.getIdPago() + ", abonoPago = " + pago.getAbonoPago() + ", totalPagado = " + pago.getTotalPagado() + ", restoPorPagar = " + pago.getRestoPorPagar() + ", numeroPago = " + pago.getNumeroPago() + ", fechaPago = " + pago.getFechaPago() + ", idProrroga = " + pago.getIdProrroga() + " where idPago = " + pago.getIdPago();
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
                pago.setTotalPagado(resultado.getInt("totalPagado"));
                pago.setRestoPorPagar(resultado.getInt("restoPorPagar"));
                pago.setNumeroPago(resultado.getInt("numeroPago"));
                pago.setFechaPago(resultado.getDate("fechaPago"));
                pago.setIdProrroga(resultado.getInt("idProrroga"));
                listado.add(pago);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
        
    }
    
    public void eliminar (Pago pago) {

        try {
            String sql = "delete from pago where IdPago = " + pago.getIdPago();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void guardar(Pago pago) {
        
        if (pago.getIdPago() == 0) {
            agregar(pago);
        } else {
            editar(pago);
        }
        
    }
    
    
}
