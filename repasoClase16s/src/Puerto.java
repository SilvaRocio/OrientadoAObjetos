import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Puerto{
    private ArrayList<Contenedor> contenedores= new ArrayList();

    public void agragarContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }
    public int calcularCantidadDePeligrosos(){
        int contador=0;
      for (Contenedor contenedor: contenedores ){
          if (contenedor.getMarca()=="Peligroso"){
              contador++;
          }
      }
      return contador;
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}
