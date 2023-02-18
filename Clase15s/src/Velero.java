import java.util.Date;

public class Velero extends  Embarcacion{
    private int cantidadMastil;

    public Velero(double precioBase, double valorAdicional, Date fechaFabricacion, double eslora) {
        super(precioBase, valorAdicional, fechaFabricacion, eslora);
    }

    @Override
    public double calcularMontoAlquiler() {
        return 0;
    }

    public boolean evaluar (){
        return true;
    }

    public int getCantidadMastil() {
        return cantidadMastil;
    }

    public void setCantidadMastil(int cantidadMastil) {
        this.cantidadMastil = cantidadMastil;
    }

}
