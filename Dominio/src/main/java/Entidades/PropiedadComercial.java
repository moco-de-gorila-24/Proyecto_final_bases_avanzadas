package Entidades;

public class PropiedadComercial {
    private boolean seguroContraDaños;

    public PropiedadComercial(){

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
