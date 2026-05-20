package Adaptadores;

import DTOs.PropiedadDTO;
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
        propiedad.setEstadoActual(EstadoActual.valueOf(document.getString("estadoActual")));
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

    public PropiedadDTO convertirPropiedadADTO(PropiedadDominio propiedadDominio){
        PropiedadDTO propiedadDTO = new PropiedadDTO();

        propiedadDTO.setIdPropiedad(propiedadDominio.getIdPropiedad());
        propiedadDTO.setIdCliente(propiedadDominio.getIdCliente());
        propiedadDTO.setEstadoActual(propiedadDominio.getEstadoActual());
        propiedadDTO.setRentaMensual(propiedadDominio.getRentaMensual());
        propiedadDTO.setCalle(propiedadDominio.getCalle());
        propiedadDTO.setColonia(propiedadDominio.getColonia());
        propiedadDTO.setCodigoPostal(propiedadDominio.getCodigoPostal());

        return propiedadDTO;
    }

    public PropiedadDominio convertirDTOAEntidad(PropiedadDTO propiedadDTO){
        PropiedadDominio propiedadDominio = new PropiedadDominio();

        propiedadDominio.setIdPropiedad(propiedadDTO.getIdPropiedad());
        propiedadDominio.setIdCliente(propiedadDTO.getIdCliente());
        propiedadDominio.setEstadoActual(propiedadDTO.getEstadoActual());
        propiedadDominio.setRentaMensual(propiedadDTO.getRentaMensual());
        propiedadDominio.setCalle(propiedadDTO.getCalle());
        propiedadDominio.setColonia(propiedadDTO.getColonia());
        propiedadDominio.setCodigoPostal(propiedadDTO.getCodigoPostal());

        return propiedadDominio;
    }
}
