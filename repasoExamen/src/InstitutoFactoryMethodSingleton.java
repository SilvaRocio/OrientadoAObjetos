import java.util.ArrayList;

public class InstitutoFactoryMethodSingleton {

    private static InstitutoFactoryMethodSingleton instancia;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList();
     private InstitutoFactoryMethodSingleton(){

     }
     public void agregarOfertas(OfertaAcademica oferta){
         this.ofertas.add(oferta);
     }
    public void eliminarOfertas(OfertaAcademica oferta){
        this.ofertas.remove(oferta);
    }
     public static InstitutoFactoryMethodSingleton obtenerInstancia (){
         if (InstitutoFactoryMethodSingleton.instancia==null){
             InstitutoFactoryMethodSingleton.instancia= new InstitutoFactoryMethodSingleton();
         }
         return InstitutoFactoryMethodSingleton.instancia;
     }
     public OfertaAcademica crearOferta( String tipo){
         switch (tipo.toUpperCase()){
             case "CURSO":
                return new Curso();
             case "CARRERA"  :
              return new CarreraComposite();
         }
         return null;
     }
     public void generarInforme(){
         for (OfertaAcademica x: this.ofertas) {
             System.out.println(x.toString());
         }
     }

}
