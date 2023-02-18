public class UnidadFactoryMethodSingleton {
    private static UnidadFactoryMethodSingleton instancia;
    private UnidadFactoryMethodSingleton(){

    }
    public static UnidadFactoryMethodSingleton obtenerInstancia(){
        if (UnidadFactoryMethodSingleton.instancia==null){
            UnidadFactoryMethodSingleton.instancia= new UnidadFactoryMethodSingleton();
        }
        return UnidadFactoryMethodSingleton.instancia;
    }
    public Unidad crearUnidad(String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new Simple();
            case "COMPUESTO":
                return new CombinadaComposite();
        }
        return null;
    }
}
