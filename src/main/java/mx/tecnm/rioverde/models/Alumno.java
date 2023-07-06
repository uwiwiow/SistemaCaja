package mx.tecnm.rioverde.models;
/**
 *
 * @author Gael Perez
 */
public class Alumno {

    private int noControl; // PK
    private String nombre;
    private String apeP;
    private String apeM;
    
    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeP() {
        return apeP;
    }

    public void setApeP(String apeP) {
        this.apeP = apeP;
    }

    public String getApeM() {
        return apeM;
    }

    public void setApeM(String apeM) {
        this.apeM = apeM;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apeP + " " + apeM;
    }
    
}
