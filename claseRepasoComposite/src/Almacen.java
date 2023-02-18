import java.util.ArrayList;

public class Almacen {
    public ArrayList<Producto> productos= new ArrayList();

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }
    public double calcularEspacio() {
        double suma=0.0;
        for (Producto x: this.productos){
            suma+=x.calcularEspacio();
        }
        return suma;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }


}
