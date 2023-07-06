package mx.tecnm.rioverde.dao;
import mx.tecnm.rioverde.models.Alumno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import net.ucanaccess.jdbc.UcanaccessConnection;
/**
 *
 * @author Gael Perez
 */
public class AlumnoDao {
    
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
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
        
    public boolean agregar (Alumno alumno) {

        try {
            String sql = "insert into alumno (noControl, nombre, apeP, apeM) values ('" + alumno.getNoControl() + "', '" + alumno.getNombre() + "', '" + alumno.getApeP() + "', '" + alumno.getApeM() + "')";
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void editar (Alumno alumno) {

        try {
            String sql = "update alumno set noControl = '" + alumno.getNoControl() + "', nombre = '" + alumno.getNombre() + "', apeP = '" + alumno.getApeP() + "', apeM = '" + alumno.getApeM() + "' where noControl = " + alumno.getNoControl();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Alumno> listar () {

        List<Alumno> listado = new ArrayList<>();
        
        
        try {
            String sql = "select * from alumno";
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
    
    public boolean eliminar (Alumno alumno) {

        try {
            String sql = "delete from alumno where noControl = " + alumno.getNoControl();
            Statement statement = conectar().createStatement();
            statement.execute(sql);
            return true;
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public List<Integer> eliminar (int[] array) {
        List<Integer> numInProrrogas = new ArrayList<>();
        try {
            
            int[] arr = new int[array.length];
            
            String csvString = Arrays.toString(array) // convierto los numeros seleccionados a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");
            
            Statement statement = conectar().createStatement();
            
            String inProrroga = "select DISTINCT alumno.noControl from alumno, prorroga WHERE alumno.noControl IN (" + csvString + ") and alumno.noControl = prorroga.noControl";
            // busco los valores que no se pueden borrar
            ResultSet res = statement.executeQuery(inProrroga);
            
            int j = 0;
            while (res.next()) {
                if (res.getInt("noControl") != 0){
                    numInProrrogas.add(res.getInt("noControl"));
                }
                j++;
            }
            
            String notInProrroga = "select DISTINCT alumno.noControl from alumno, prorroga WHERE alumno.noControl IN (" + csvString + ") and alumno.noControl != prorroga.noControl";
            // busco los valores del csv que si se pueden borrar

            ResultSet resultado = statement.executeQuery(notInProrroga);
            int i = 0;
            while (resultado.next()) {
                arr[i] = resultado.getInt("noControl"); // los guardo en un array
                i++;
            }
            
            String csv = Arrays.toString(arr) // convierto la array de los numeros que si se pueden borrar a csv
                .replace("[", "")
                .replace("]", "")
                .replaceAll("\\s+", "");
            
            String sql = "DELETE FROM alumno WHERE noControl IN (" + csv + ");"; // borro los numeros que si se pueden borrar
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return numInProrrogas;
    }
    
    public void guardar(Alumno alumno) {
        
        if (alumno.getNoControl() == 0) {
            agregar(alumno);
        } else {
            editar(alumno);
        }
        
    }
    
    public boolean importar(String path, String table){

        // Detalles del archivo ACCDB
        String accdbPath = path;
        String accdbTableName = table;
  
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + path);
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT [noControl],[nombre],[apeP],[apeM] FROM [" + table + "]");
            
            StringBuilder sb = new StringBuilder();
            
            while (rs.next()) {
                sb.append("(" + rs.getString(1) + ", '" + rs.getString(2) + "', '" + rs.getString(3) + "', '" + rs.getString(4) + "'),");
            }
            String cadena = sb.toString();
            String resultado = cadena.substring(0, cadena.length() - 1);
            
            try {
                String sql = "INSERT INTO alumno (noControl, nombre, apeP, apeM) VALUES " + resultado;
                Statement statement = conectar().createStatement();
                statement.execute(sql);
                return true;
            } catch (Exception ex) {
                Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public String obtenerNombre (String noControl) {

        String nombre = "";
        
        try {
            String sql = "select * from alumno where noControl = " + noControl;
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            Alumno alumno = new Alumno();
            
            while (resultado.next()) {
                alumno.setNoControl(resultado.getInt("noControl"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApeP(resultado.getString("apeP"));
                alumno.setApeM(resultado.getString("apeM"));
            }

            nombre = alumno.getNombreCompleto();
            
            if (nombre.equals("null null null")){
                nombre = "Error";
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nombre;
        
    }
    
}
