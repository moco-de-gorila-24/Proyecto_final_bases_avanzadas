package Entidades;

import Enums.EstadoActual;

/**
 *
 * @author Luis Alonso
 */
public class PropiedadDominio {
    private long idPropiedad;
    private long idCliente;
    private EstadoActual estadoActual;
    private double rentaMensual;
    private String calle;
    private String colonia;
    private Integer codigoPostal;

    public PropiedadDominio() {

    }

    public PropiedadDominio(long idPropiedad, long idCliente, EstadoActual estadoActual, double rentaMensual, String calle, String colonia, Integer codigoPostal) {
        this.idPropiedad = idPropiedad;
        this.idCliente = idCliente;
        this.estadoActual = estadoActual;
        this.rentaMensual = rentaMensual;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public EstadoActual getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoActual estadoActual) {
        this.estadoActual = estadoActual;
    }

    public double getRentaMensual() {
        return rentaMensual;
    }

    public void setRentaMensual(double rentaMensual) {
        this.rentaMensual = rentaMensual;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
