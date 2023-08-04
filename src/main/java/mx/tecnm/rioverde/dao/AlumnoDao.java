package mx.tecnm.rioverde.dao;
import java.io.FileReader;
import mx.tecnm.rioverde.models.Alumno;
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
import net.ucanaccess.jdbc.UcanaccessConnection;
import org.h2.tools.RunScript;
/**
 *
 * @author Gael Perez
 */
public class AlumnoDao {
    
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
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
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
            
            int[] prorrogas = numInProrrogas.stream().mapToInt(Integer::intValue).toArray();
            
            int [] re = removeElementsFromArray(array, prorrogas);
            
            String csv = Arrays.toString(re) // convierto la array de los numeros que si se pueden borrar a csv
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
    
    
    public boolean importar(String path, String table){

  
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + path);
            Statement s = conn.createStatement();
            ResultSet rs = null;
            try {
                rs = s.executeQuery("SELECT [noControl],[nombre],[apeP],[apeM] FROM [" + table + "]");
            } catch (Exception ex) {
                Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, "No se importo el nombre de la tabla", ex);
                return false;
            }
            
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

    public String obtenerNombre(String noControl) {
        String nombre = "";

        try {
            String sql = "SELECT * FROM alumno WHERE noControl = " + noControl ;
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                String nombreAlumno = resultado.getString("nombre");
                String apePaterno = resultado.getString("apeP");
                String apeMaterno = resultado.getString("apeM");

                // Verificar si algún campo del nombre está como null y reemplazarlo con una cadena vacía.
                nombreAlumno = (nombreAlumno != null) ? nombreAlumno : "";
                apePaterno = (apePaterno != null) ? apePaterno : "";
                apeMaterno = (apeMaterno != null) ? apeMaterno : "";

                // Concatenar los nombres para obtener el nombre completo.
                nombre = nombreAlumno + " " + apePaterno + " " + apeMaterno;
            } else {
                nombre = "Error"; // Si no se encontró al alumno, devolver "Error".
            }

        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nombre;
    }

    
    public int obtenerNoControl(int idProrroga) {
        int noControl = 0;

        try {
            String sql = "SELECT DISTINCT ALUMNO.NOCONTROL " +
                         "FROM ALUMNO, PRORROGA " +
                         "WHERE PRORROGA.IDPRORROGA = " + idProrroga + " AND PRORROGA.NOCONTROL = ALUMNO.NOCONTROL";
            Statement statement = conectar().createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                noControl = resultado.getInt("noControl");
            }

        } catch (Exception ex) {
            Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return noControl;
    }

    
}
