package Entidades;

import Enums.EstadoOrden;
import Enums.Prioridad;

import java.time.LocalDateTime;

/**
 *
 * @author Luis Alonso
 */
public class OrdenServicioDominio {
    private String idOrdenServicio;
    private String idPropiedad;
    private EstadoOrden estadoActual;
    private Prioridad prioridad;
    private String descripcion;
    private LocalDateTime fechaHora;

    public OrdenServicioDominio() {

    }

    public OrdenServicioDominio(String idOrdenServicio, String idPropiedad,Prioridad prioridad, String descripcion, LocalDateTime fechaHora) {
        this.idOrdenServicio = idOrdenServicio;
        this.idPropiedad = idPropiedad;
        this.estadoActual = EstadoOrden.Pendiente;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public String getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(String idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPrioridad) {
        this.idPropiedad = idPropiedad;
    }

    public EstadoOrden getEstado() {
        return estadoActual;
    }

    public void setEstado(EstadoOrden estado) {
        this.estadoActual = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
