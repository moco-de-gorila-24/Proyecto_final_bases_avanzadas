package Adaptadores;

import Entidades.PropiedadDominio;
import Enums.EstadoActual;
import org.bson.Document;
import org.bson.types.ObjectId;

public class PropiedadAdaptador {
    public Document convertirADocumento(PropiedadDominio propiedad){
        Document documento = new Document("estadoActual", propiedad.getEstadoActual())
                .append("rentaMensual", propiedad.getRentaMensual())
                .append("calle", propiedad.getCalle())
                .append("colonia", propiedad.getColonia())
                .append("codigoPostal", propiedad.getCodigoPostal());

        return documento;
    }

    public PropiedadDominio documentoAPropiedad(Document document){
        PropiedadDominio propiedad = new PropiedadDominio();

        propiedad.setIdPropiedad(convertirObjectIDTexto(document.getObjectId("_id")));
        propiedad.setIdCliente(convertirObjectIDTexto(document.getObjectId("idCliente")));
        propiedad.setEstadoActual(EstadoActual.valueOf(document.getString("estado")));
        propiedad.setRentaMensual(document.getDouble("rentaMensual"));
        propiedad.setCalle(document.getString("calle"));
        propiedad.setColonia(document.getString("colonia"));
        propiedad.setCodigoPostal(document.getInteger("codigoPostal"));

        return propiedad;
    }

    private String convertirObjectIDTexto(ObjectId id){
        if(id != null){
            return id.toHexString();
        }
        return null;
    }
}
