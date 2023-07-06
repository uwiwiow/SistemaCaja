package mx.tecnm.rioverde.dao;
import mx.tecnm.rioverde.models.Prorroga;
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
public class ProrrogaDao {
    
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
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
        
    public void agregar (Prorroga prorroga) {

        try {
            String sql = "insert into prorroga (semestrePorPagar, fechaPedido,  fechaLiq, totalPorPagar, noControl, concepto) VALUES ('" + prorroga.getSemestrePorPagar() + "', '" + prorroga.getFechaPedido() + "', '" + prorroga.getFechaLiq() + "', " + prorroga.getTotalPorPagar() + ", " + prorroga.getNoControl() + ", " + prorroga.getConcepto()+ ");";
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
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
                prorroga.setFechaPedido(resultado.getDate("fechaPedido"));
                prorroga.setFechaLiq(resultado.getDate("fechaLiq"));
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
    
    public void eliminar (Prorroga prorroga) {

        try {
            String sql = "delete from prorroga where idProrroga = " + prorroga.getIdProrroga();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(ProrrogaDao.class.getName()).log(Level.SEVERE, null, ex);
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
