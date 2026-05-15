package Adaptadores;

import Entidades.OrdenServicioDominio;
import Enums.EstadoActual;
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

    public OrdenServicioDominio DocumentoAOrden(Document documento){
        OrdenServicioDominio orden = new OrdenServicioDominio();

        orden.setIdOrdenServicio(convertirObjectIDTexto(documento.getObjectId("_id")));
        orden.setIdPropiedad(convertirObjectIDTexto(documento.getObjectId("idPropiedad")));
        orden.setEstado(EstadoActual.valueOf(documento.getString("estado")));
        orden.setPrioridad(Prioridad.valueOf(documento.getString("prioridad")));
        orden.setDescripcion(documento.getString("descripcion"));

        LocalDateTime fechaHora = documento.getDate("fechaHora")
                .toInstant() // sacamos la instancia de localdaet
                .atZone(ZoneId.systemDefault()) //aplicamos la zona
                .toLocalDateTime(); // convertimos

        orden.setFechaHora(fechaHora);
        return orden;
    }

    private String convertirObjectIDTexto(ObjectId id){
        if(id != null){
            return id.toHexString();
        }
        return null;
    }
}
