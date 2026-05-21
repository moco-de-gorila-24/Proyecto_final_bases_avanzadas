package Adaptadores;

import DTOs.OrdenDTO;
import Entidades.OrdenServicioDominio;
import Enums.EstadoOrden;
import Enums.Prioridad;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class OrdenServicioAdaptador {

    public Document convertirADocumento(OrdenServicioDominio ordenServicio){
        Document documento = new Document("idOrdenServicio", ordenServicio.getIdOrdenServicio())
                .append("idPropiedad", ordenServicio.getIdPropiedad())
                .append("estadoActual", ordenServicio.getEstado())
                .append("prioridad", ordenServicio.getPrioridad())
                .append("descripcion", ordenServicio.getDescripcion())
                .append("fechaHora", ordenServicio.getFechaHora());

        return documento;
    }

    public OrdenServicioDominio documentoAOrden(Document documento){
        OrdenServicioDominio orden = new OrdenServicioDominio();

        orden.setIdOrdenServicio(convertirObjectIDTexto(documento.getObjectId("_id")));
        orden.setIdPropiedad(convertirObjectIDTexto(documento.getObjectId("idPropiedad")));
        orden.setEstado(EstadoOrden.valueOf(documento.getString("estadoActual")));
        orden.setPrioridad(Prioridad.valueOf(documento.getString("prioridad")));
        orden.setDescripcion(documento.getString("descripcion"));

        LocalDateTime fechaHora = documento.getDate("fechaHora")
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        orden.setFechaHora(fechaHora);
        return orden;
    }

    private String convertirObjectIDTexto(ObjectId id){
        if(id != null){
            return id.toHexString();
        }
        return null;
    }

    public OrdenDTO convertirEntidadADTO(OrdenServicioDominio orden){
        OrdenDTO ordenDTO = new OrdenDTO();

        ordenDTO.setIdOrdenServicio(orden.getIdOrdenServicio()); // falta
        ordenDTO.setIdPropiedad(orden.getIdPropiedad());
        ordenDTO.setEstadoActual(orden.getEstado());
        ordenDTO.setPrioridad(orden.getPrioridad());
        ordenDTO.setDescripcion(orden.getDescripcion());
        ordenDTO.setFechaHora(orden.getFechaHora());

        return ordenDTO;
    }

    public OrdenServicioDominio convertirDTOAEntidad(OrdenDTO ordenDTO){
        OrdenServicioDominio ordenServicioDominio = new OrdenServicioDominio();

        ordenServicioDominio.setIdOrdenServicio(ordenDTO.getIdOrdenServicio());
        ordenServicioDominio.setIdPropiedad(ordenDTO.getIdPropiedad());
        ordenServicioDominio.setEstado(ordenDTO.getEstadoActual());
        ordenServicioDominio.setPrioridad(ordenDTO.getPrioridad());
        ordenServicioDominio.setDescripcion(ordenDTO.getDescripcion());
        ordenServicioDominio.setFechaHora(ordenDTO.getFechaHora());

        return ordenServicioDominio;
    }

}
