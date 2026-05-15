package Entidades;

/**
 *
 * @author Luis Alonso
 */
public class ClienteDominio {
    private long idCliente;
    private String telefono;
    private double ingresosMensuales;
    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public ClienteDominio() {

    }

    public ClienteDominio(long idCliente, String telefono, double ingresosMensuales, String primerNombre, String apellidoPaterno, String apellidoMaterno) {
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.ingresosMensuales = ingresosMensuales;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
