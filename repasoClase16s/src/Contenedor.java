import java.util.Comparator;

public class Contenedor implements Comparable<Contenedor>, Comparator<Contenedor> {
    private int identificacion;
    private String pais;
    private String marca;

    public Contenedor(int identificacion, String pais, String marca) {
        this.identificacion = identificacion;
        this.pais = pais;
        this.marca = marca;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.identificacion> contenedor.getIdentificacion()){
            return 1;
        }else if (this.identificacion< contenedor.getIdentificacion()){
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(Contenedor contenedor1, Contenedor contenedor2) {
        return contenedor1.compareTo(contenedor2);
    }
}
