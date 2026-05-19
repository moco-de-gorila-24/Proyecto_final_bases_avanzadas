package DTOs;

/**
 * Clase encargada de pasar entre las capas con la clase de plan pago
 *
 * @author Luis Alonso
 * */
public class PlanPagoDTO {
    private String idPlanPago;
    private double deposito;
    private double primeraRenta;
    private double gastosAdministrativos;

    public PlanPagoDTO() {
    }

    public PlanPagoDTO(double primeraRenta, double gastosAdministrativos, double deposito) {
        this.primeraRenta = primeraRenta;
        this.gastosAdministrativos = gastosAdministrativos;
        this.deposito = deposito;
    }

    public PlanPagoDTO(String idPlanPago, double deposito, double primeraRenta, double gastosAdministrativos) {
        this.idPlanPago = idPlanPago;
        this.deposito = deposito;
        this.primeraRenta = primeraRenta;
        this.gastosAdministrativos = gastosAdministrativos;
    }

    public double getDeposito() {

        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public String getIdPlanPago() {
        return idPlanPago;
    }

    public void setIdPlanPago(String idPlanPago) {
        this.idPlanPago = idPlanPago;
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
