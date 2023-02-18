import java.util.ArrayList;

public class ContenedorComposite extends Carga{
private ArrayList<Carga> cargas= new ArrayList();
private double pesoContenedor;

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public void agregarCarga(Carga carga){
    this.cargas.add(carga);
}
    public void eliminarCarga(Carga carga){
        this.cargas.remove(carga);
    }


    @Override
    public double calcularPeso() {
    double suma=0.0;
        for (Carga x:this.cargas) {
            suma+= x.calcularPeso();

        }
        return suma+this.pesoContenedor;
    }
}
