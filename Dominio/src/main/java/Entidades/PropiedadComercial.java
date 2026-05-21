package Entidades;

import Enums.EstadoPropiedad;

public class PropiedadComercial extends PropiedadDominio{
    private boolean seguroContraDaños;

    public PropiedadComercial(){

    }

    public PropiedadComercial(String idCliente, EstadoPropiedad estadoPropiedad, double rentaMensual, String calle, String colonia, Integer codigoPostal, boolean seguroContraDanos) {
        super(idCliente, estadoPropiedad, rentaMensual, calle, colonia, codigoPostal);
        this.seguroContraDaños = seguroContraDanos;
    }

    public PropiedadComercial(boolean seguroContraDaños) {
        this.seguroContraDaños = seguroContraDaños;
    }

    public boolean isSeguroContraDaños() {
        return seguroContraDaños;
    }

    public void setSeguroContraDaños(boolean seguroContraDaños) {
        this.seguroContraDaños = seguroContraDaños;
    }
}
