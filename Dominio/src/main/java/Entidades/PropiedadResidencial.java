package Entidades;

import Enums.EstadoPropiedad;

public class PropiedadResidencial extends PropiedadDominio{
    public PropiedadResidencial(){

    }

    public PropiedadResidencial(String idCliente, EstadoPropiedad estadoPropiedad, double rentaMensual, String calle, String colonia, Integer codigoPostal) {
        super(idCliente, estadoPropiedad, rentaMensual, calle, colonia, codigoPostal);
    }
}
