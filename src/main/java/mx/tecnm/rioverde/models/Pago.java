package mx.tecnm.rioverde.models;
/**
 *
 * @author Gael Perez
 */
import java.sql.Date;
public class Pago {

    private int idPago;
    private int abonoPago;
    private int totalPagado;
    private int restoPorPagar;
    private int numeroPago;
    private Date fechaPago;
    private int idProrroga;
    
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getAbonoPago() {
        return abonoPago;
    }

    public void setAbonoPago(int abonoPago) {
        this.abonoPago = abonoPago;
    }

    public int getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(int totalPagado) {
        this.totalPagado = totalPagado;
    }

    public int getRestoPorPagar() {
        return restoPorPagar;
    }

    public void setRestoPorPagar(int restoPorPagar) {
        this.restoPorPagar = restoPorPagar;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getIdProrroga() {
        return idProrroga;
    }

    public void setIdProrroga(int idProrroga) {
        this.idProrroga = idProrroga;
    }
    
}
