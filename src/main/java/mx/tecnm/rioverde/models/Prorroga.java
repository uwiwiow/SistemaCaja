package mx.tecnm.rioverde.models;
/**
 *
 * @author Gael Perez
 */
import java.sql.Date;
public class Prorroga {

    private String semestrePorPagar;
    private Date fechaPedido;
    private Date fechaLiq;
    private int totalPorPagar;
    private String concepto;
    private int noControl;  // FK
    private int idProrroga; // PK

    public String getSemestrePorPagar() {
        return semestrePorPagar;
    }

    public void setSemestrePorPagar(String semestrePorPagar) {
        this.semestrePorPagar = semestrePorPagar;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaLiq() {
        return fechaLiq;
    }

    public void setFechaLiq(Date fechaLiq) {
        this.fechaLiq = fechaLiq;
    }

    public int getTotalPorPagar() {
        return totalPorPagar;
    }

    public void setTotalPorPagar(int totalPorPagar) {
        this.totalPorPagar = totalPorPagar;
    }
    
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public int getIdProrroga() {
        return idProrroga;
    }

    public void setIdProrroga(int idProrroga) {
        this.idProrroga = idProrroga;
    }

}
