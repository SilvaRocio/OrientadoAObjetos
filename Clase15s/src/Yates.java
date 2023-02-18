import java.util.Date;

public class Yates extends  Embarcacion implements Comparable<Yates>{
    private int cantidadCamarotes;

    public Yates(double precioBase, double valorAdicional, Date fechaFabricacion, double eslora) {
        super(precioBase, valorAdicional, fechaFabricacion, eslora);
    }

    @Override
    public double calcularMontoAlquiler() {
        return 0;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Yates yate) {

    }
}
