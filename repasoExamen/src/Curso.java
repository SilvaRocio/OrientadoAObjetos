public class Curso extends  OfertaAcademica{
    private  String nombre;
    private String descripcion;
    private double duracion;
    private double valorXHora;
    private double cargaHoraria;

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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getValorXHora() {
        return valorXHora;
    }

    public void setValorXHora(double valorXHora) {
        this.valorXHora = valorXHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double precioCalcular() {
        return this.cargaHoraria*this.duracion*this.valorXHora;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + this.nombre + '\'' +
                ", duracion=" + this.duracion +
                ", valorXHora=" + this.valorXHora +
                ", cargaHoraria=" + this.cargaHoraria +
                ", precio=" + precioCalcular() +
                '}';
    }
}
