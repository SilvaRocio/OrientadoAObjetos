import java.util.ArrayList;

public class Barco {
    private String matricula;
    private ArrayList<Carga> cargas= new ArrayList();
    public void  agregarCarga(Carga x){
        this.cargas.add(x);
    }
    public void  eliminarCarga(Carga x){
        this.cargas.remove(x);
    }
    public void mostrarCarga (){
        for (Carga x: this.cargas) {
            System.out.println("El nombre de la carga es : "+ x.getNombre()+ "el peso es  : "+ x.calcularPeso() +" KG");

        }
    }
}
