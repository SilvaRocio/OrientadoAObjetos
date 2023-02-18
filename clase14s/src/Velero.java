import java.util.Date;

public class Velero extends Embarcacion {
    private int cantidadMastil;

    public Velero(double precioBase, double valorAdicional, Date fechaFabricacion, double eslora, Capitan capitan, int cantidadMastil) {
        super(precioBase, valorAdicional, fechaFabricacion, eslora, capitan);
        this.cantidadMastil = cantidadMastil;
    }

    public int getCantidadMastil() {
        return cantidadMastil;
    }

    public void setCantidadMastil(int cantidadMastil) {
        this.cantidadMastil = cantidadMastil;
    }

    public boolean evaluarMastil() {
        if (this.cantidadMastil > 4) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularMontoAlquiler() {
        return 0;
    }
}
