import java.util.Date;

public  abstract  class Embarcacion {
    protected double precioBase;
    protected double valorAdicional;
    protected Date fechaFabricacion;
    protected double eslora;
    protected  Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, Date fechaFabricacion, double eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.fechaFabricacion = fechaFabricacion;
        this.eslora = eslora;
    }

    public abstract double calcularMontoAlquiler();

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}
