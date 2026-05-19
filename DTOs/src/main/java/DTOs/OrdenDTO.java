package DTOs;

import Enums.EstadoActual;
import Enums.Prioridad;

import java.time.LocalDateTime;

public class OrdenDTO {
    private String idOrdenServicio;
    private String idPropiedad;
    private EstadoActual estadoActual;
    private Prioridad prioridad;
    private String descripcion;
    private LocalDateTime fechaHora;

    public OrdenDTO() {
    }

    public OrdenDTO(EstadoActual estadoActual, String idPropiedad, Prioridad prioridad, String descripcion, LocalDateTime fechaHora) {
        this.estadoActual = estadoActual;
        this.idPropiedad = idPropiedad;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public OrdenDTO(String idOrdenServicio, String idPropiedad, EstadoActual estadoActual, Prioridad prioridad, String descripcion, LocalDateTime fechaHora) {
        this.idOrdenServicio = idOrdenServicio;
        this.idPropiedad = idPropiedad;
        this.estadoActual = estadoActual;
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

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public EstadoActual getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoActual estadoActual) {
        this.estadoActual = estadoActual;
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
