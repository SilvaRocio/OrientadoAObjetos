package clase7S;

public class Editorial {
    private String nombre;
    private String direccion;
    private Revista[] revistas;
    public Editorial() {

    }
     public Editorial (String nombre, String direccion){
         this.nombre=nombre;
         this.direccion=direccion;
     }
     public String getNombre(){
        return this.nombre;
     }
    public String getDireccion(){
        return this.direccion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
}
