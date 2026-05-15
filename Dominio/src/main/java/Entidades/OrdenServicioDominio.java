package Entidades;

import Enums.EstadoActual;
import Enums.Prioridad;

import java.time.LocalDateTime;

/**
 *
 * @author Luis Alonso
 */
public class OrdenServicioDominio {
    private long idOrdenServicio;
    private long idPrioridad;
    private EstadoActual estadoActual;
    private Prioridad prioridad;
    private String descripcion;
    private LocalDateTime fechaHora;

    public OrdenServicioDominio() {

    }

    public OrdenServicioDominio(long idOrdenServicio, long idPrioridad, EstadoActual estado, Prioridad prioridad, String descripcion, LocalDateTime fechaHora) {
        this.idOrdenServicio = idOrdenServicio;
        this.idPrioridad = idPrioridad;
        this.estadoActual = estado;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public long getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(long idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public long getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(long idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public EstadoActual getEstado() {
        return estadoActual;
    }

    public void setEstado(EstadoActual estado) {
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
