package Entidades;

/**
 *
 * @author Luis Alonso
 */
public class PlanPagoDominio {
    private String idPlanPago;
    private double deposito;
    private double primeraRenta;
    private double gastosAdministrativos;

    public PlanPagoDominio() {

    }

    public PlanPagoDominio(String idPlanPago, double deposito, double primeraRenta, double gastosAdministrativos) {
        this.idPlanPago = idPlanPago;
        this.deposito = deposito;
        this.primeraRenta = primeraRenta;
        this.gastosAdministrativos = gastosAdministrativos;
    }

    public String getIdPlanPago() {
        return idPlanPago;
    }

    public void setIdPlanPago(String idPlanPago) {
        this.idPlanPago = idPlanPago;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getPrimeraRenta() {
        return primeraRenta;
    }

    public void setPrimeraRenta(double primeraRenta) {
        this.primeraRenta = primeraRenta;
    }

    public double getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(double gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }
}
