package clase14S;

import java.util.Date;

public class Embaracion {
    private Capitan capitan ;
    private Double precioBase;
    private Double precioAdicional;
    private Date fecha;
    private Double eslora;

    public Embaracion(Capitan capitan, Double precioBase, Double precioAdicional, Date fecha, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.precioAdicional = precioAdicional;
        this.fecha = fecha;
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(Double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

}
