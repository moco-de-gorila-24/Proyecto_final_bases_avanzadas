package Adaptadores;

import Entidades.ClienteDominio;
import Entidades.PlanPagoDominio;
import org.bson.Document;
import org.bson.types.ObjectId;

public class PlanPagoAdaptador {
    public Document convertirADocumento(PlanPagoDominio cliente){
        Document documento = new Document("deposito",cliente.getDeposito())
                .append("primeraRenta", cliente.getPrimeraRenta())
                .append("gastosAdministrativos", cliente.getGastosAdministrativos());

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
}
