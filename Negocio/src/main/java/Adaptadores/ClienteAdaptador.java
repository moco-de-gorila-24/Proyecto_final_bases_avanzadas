package Adaptadores;

import DTOs.ClienteDTO;
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

    public ClienteDTO convertirEntidadADTO(ClienteDominio cliente){
        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setTelefono(cliente.getTelefono());
        clienteDTO.setIngresosMensuales(cliente.getIngresosMensuales());
        clienteDTO.setPrimerNombre(cliente.getPrimerNombre());
        clienteDTO.setApellidoPaterno(cliente.getApellidoPaterno());
        clienteDTO.setApellidoMaterno(cliente.getApellidoMaterno());

        return clienteDTO;
    }

    public ClienteDominio convertirDTOAEntidad(ClienteDTO cliente){
        ClienteDominio clienteDominio = new ClienteDominio();

        clienteDominio.setTelefono(cliente.getTelefono());
        clienteDominio.setIngresosMensuales(cliente.getIngresosMensuales());
        clienteDominio.setPrimerNombre(cliente.getPrimerNombre());
        clienteDominio.setApellidoPaterno(cliente.getApellidoPaterno());
        clienteDominio.setApellidoMaterno(cliente.getApellidoMaterno());

        return clienteDominio;
    }
}
