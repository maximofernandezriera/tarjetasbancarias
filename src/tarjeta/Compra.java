package tarjeta;

public class Compra {

    String establecimiento;
    double gasto;

    public Compra(String establecimiento, double gasto){
        this.establecimiento = establecimiento;
        this.gasto = gasto;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
}
