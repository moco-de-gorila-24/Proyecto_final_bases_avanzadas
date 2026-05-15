package Entidades;

import Enums.EstadoActual;

/**
 *
 * @author Luis Alonso
 */
public class PropiedadDominio {
    private String idPropiedad;
    private String idCliente;
    private EstadoActual estadoActual;
    private double rentaMensual;
    private String calle;
    private String colonia;
    private Integer codigoPostal;

    public PropiedadDominio() {

    }

    public PropiedadDominio(String idPropiedad, String idCliente, EstadoActual estadoActual, double rentaMensual, String calle, String colonia, Integer codigoPostal) {
        this.idPropiedad = idPropiedad;
        this.idCliente = idCliente;
        this.estadoActual = estadoActual;
        this.rentaMensual = rentaMensual;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
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
