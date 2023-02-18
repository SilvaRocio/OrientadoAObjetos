import java.util.Date;

public class Yate extends  Embarcacion implements Comparable<Yate>{
    private int cantidadCamarotes;

    public Yate(double precioBase, double valorAdicional, Date fechaFabricacion, double eslora, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, valorAdicional, fechaFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public double calcularMontoAlquiler() {
        return 0;
    }

    @Override
    public int compareTo(Yate yate) {
        int cantidadUno= this.cantidadCamarotes;
        int cantidadDos=yate.getCantidadCamarotes();
        if (cantidadUno> cantidadDos){
            return 1;
        }else if (cantidadUno< cantidadDos){
            return -1;
        }
        return 0;
    }
}
