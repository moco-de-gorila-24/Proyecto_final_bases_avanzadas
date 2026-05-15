package Adaptadores;

import Entidades.ClienteDominio;
import org.bson.Document;
import org.bson.types.ObjectId;

public class ClienteAdaptador {

    public Document convertirADocumento(ClienteDominio cliente) {
        Document documento = new Document("telefono", cliente.getTelefono())
                .append("ingresosMensuales", cliente.getIngresosMensuales())
                .append("primerNombre", cliente.getPrimerNombre())
                .append("apellidoPaterno", cliente.getApellidoPaterno())
                .append("apellidoMaterno", cliente.getApellidoMaterno());

        return documento;
    }

    public ClienteDominio documentoACliente(Document cliente){
        ClienteDominio clienteDominio = new ClienteDominio();

        clienteDominio.setIdCliente(convertirObjectIDTexto(cliente.getObjectId("_id")));
        clienteDominio.setTelefono(cliente.getString("telefono"));
        clienteDominio.setIngresosMensuales(cliente.getDouble("ingresosMensuales"));
        clienteDominio.setPrimerNombre(cliente.getString("primerNombre"));
        clienteDominio.setApellidoPaterno(cliente.getString("apellidoPaterno"));
        clienteDominio.setApellidoMaterno(cliente.getString("apellidoMaterno"));

        return clienteDominio;
    }

    private String convertirObjectIDTexto(ObjectId id){
        if(id != null){
            return id.toHexString();
        }
        return null;
    }
}
