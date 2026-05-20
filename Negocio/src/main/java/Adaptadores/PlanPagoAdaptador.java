package Adaptadores;

import DTOs.PlanPagoDTO;
import Entidades.ClienteDominio;
import Entidades.PlanPagoDominio;
import org.bson.Document;
import org.bson.types.ObjectId;

public class PlanPagoAdaptador {
    public Document convertirADocumento(PlanPagoDominio planPagoDominio){
        Document documento = new Document("deposito", planPagoDominio.getDeposito())
                .append("primeraRenta", planPagoDominio.getPrimeraRenta())
                .append("gastosAdministrativos", planPagoDominio.getGastosAdministrativos());

        return documento;
    }

    public PlanPagoDominio documentoAPlanPago(Document document){
        PlanPagoDominio plan = new PlanPagoDominio();

        plan.setIdPlanPago(convertirObjectIDTexto(document.getObjectId("_id")));
        plan.setDeposito(document.getDouble("deposito"));
        plan.setPrimeraRenta(document.getDouble("primeraRenta"));
        plan.setGastosAdministrativos(document.getDouble("gastosAdministrativos"));

        return plan;
    }

    private String convertirObjectIDTexto(ObjectId id){
        if(id != null){
            return id.toHexString();
        }
        return null;
    }

    public PlanPagoDominio convertirDTOAEntidad(PlanPagoDTO planPagoDTO){
        PlanPagoDominio planPagoDominio = new PlanPagoDominio();

        planPagoDominio.setDeposito(planPagoDTO.getDeposito());
        planPagoDominio.setPrimeraRenta(planPagoDTO.getPrimeraRenta());
        planPagoDominio.setGastosAdministrativos(planPagoDTO.getGastosAdministrativos());

        return planPagoDominio;
    }

    public PlanPagoDTO convertirEntidadADTO(PlanPagoDominio planPagoDominio){
        PlanPagoDTO planPagoDTO = new PlanPagoDTO();

        planPagoDTO.setDeposito(planPagoDominio.getDeposito());
        planPagoDTO.setPrimeraRenta(planPagoDominio.getPrimeraRenta());
        planPagoDTO.setGastosAdministrativos(planPagoDominio.getGastosAdministrativos());

        return planPagoDTO;
    }
}
