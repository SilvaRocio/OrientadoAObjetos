public class CargaFactoryMethodSingleton {
    private static CargaFactoryMethodSingleton instancia;
    private CargaFactoryMethodSingleton(){

    }
    public static CargaFactoryMethodSingleton obtenerInstancia(){
        if (CargaFactoryMethodSingleton.instancia==null){
            CargaFactoryMethodSingleton.instancia= new CargaFactoryMethodSingleton();
        }
        return CargaFactoryMethodSingleton.instancia;
    }
    public Carga crearCarga(String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new Simple();
            case "CONTENEDOR" :
                return new ContenedorComposite();
        }
        return null;
    }
}
