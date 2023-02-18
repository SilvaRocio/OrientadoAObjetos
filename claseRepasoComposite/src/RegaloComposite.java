import java.util.ArrayList;

public class RegaloComposite extends Producto{
    private double peso;
    public ArrayList<Producto> productos = new ArrayList();

   public void agragarProducto(Producto producto){
       this.productos.add(producto);
   }
    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }
   @Override
    public double calcularEspacio() {
        double suma=0.0;
        for (Producto x: this.productos){
             suma+=x.calcularEspacio();
        }
       return suma;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
