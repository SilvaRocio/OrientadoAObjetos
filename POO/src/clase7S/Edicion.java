package clase7S;

import java.util.Date;

public class Edicion {
    private int numero;
    private Date fecha;
    private Double precio;
    private Articulo[] articulos;

    public Edicion(int numero, Date fecha, Double precio) {
        this.numero = numero;
        this.fecha=fecha;
        this.precio=precio;
        this.articulos= new Articulo[10];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
