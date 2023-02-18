import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica {
    private String nombre;
    private String descripcion;
    private double descuento;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList();

    public void agregarCurso(OfertaAcademica curso) {
        this.ofertas.add(curso);
    }

    public void EliminarCurso(OfertaAcademica curso) {
        this.ofertas.remove(curso);
    }

    @Override
    public double precioCalcular() {
        double suma = 0.0;
        for (OfertaAcademica x : ofertas) {
            suma+=x.precioCalcular();
        }

        return suma-((suma*descuento)/100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "CarreraComposite{" +
                "nombre='" + this.nombre + '\'' + "precio : "+ precioCalcular()+
                '}';
    }
}
