package EjercitacionClase6s;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    public UsuarioJuego(String nombre,String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }

    public Double getPuntaje() {
        return this.puntaje;
    }

    public int getNivel() {
        return this.nivel;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public void setPuntaje(Double puntaje){
        this.puntaje = puntaje;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void aumentarPuntaje(){
      this.puntaje++;
    }
    public void subirNivel(){
        this.nivel++;
    }
    public void bonus(int valor){
        this.nivel += valor;
    }

}
