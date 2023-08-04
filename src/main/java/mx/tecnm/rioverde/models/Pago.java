package mx.tecnm.rioverde.models;
/**
 *
 * @author Gael Perez
 */
public class Pago {

    private int idPago;
    private int abonoPago;
    private int numeroPago;
    private String fechaPago;
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

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getIdProrroga() {
        return idProrroga;
    }

    public void setIdProrroga(int idProrroga) {
        this.idProrroga = idProrroga;
    }
    
}
