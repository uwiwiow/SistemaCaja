package mx.tecnm.rioverde.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import mx.tecnm.rioverde.models.Alumno;
/**
 *
 * @author Gael Perez
 */
public class AlumnoBusquedaDao {
    
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
            Logger.getLogger(AlumnoBusquedaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public List<Alumno> listar (String Cbox, String condicion, int typeCase) {

        List<Alumno> listado = new ArrayList<>();
        
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
                    sql = "select * from alumno where " + Cbox + " = '" + condicion + "'";
                    break;
                }
                case 1: {
                    sql = "select * from alumno where " + Cbox + " LIKE '" + condicion + "%';";
                    break;
                }
                case 2: {
                    sql = "select * from alumno where " + Cbox + " LIKE '%" + condicion + "';";
                    break;
                }
                case 3: {
                    sql = "select * from alumno where " + Cbox + " LIKE '%" + condicion + "%';";
                    break;
                }
                default: sql = "select * from alumno where " + Cbox + " = '" + condicion + "'";
            }
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            while (resultado.next()) {
                Alumno alumno = new Alumno();
                alumno.setNoControl(resultado.getInt("noControl"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApeP(resultado.getString("apeP"));
                alumno.setApeM(resultado.getString("apeM"));
                listado.add(alumno);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listado;
        
    }
    

}
