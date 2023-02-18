public class ProductoFactoryMethodSingleton {
    private static ProductoFactoryMethodSingleton instancia;

    private ProductoFactoryMethodSingleton() {

    }
    public static ProductoFactoryMethodSingleton obtenerInstancia (){
        if (ProductoFactoryMethodSingleton.instancia== null){
            ProductoFactoryMethodSingleton.instancia= new ProductoFactoryMethodSingleton();
        }
        return ProductoFactoryMethodSingleton.instancia;
    }
    public Producto crearProducto( String tipo){
        switch (tipo.toUpperCase()){
            case "CAJA":
                return new Caja();
            case "PAPEL REGALO":
                return new PapelRegalo();
            case "MOÑO":
                return new Moño();
            case "PELOTA":
               return  new Pelota();

        }
        return null;
    }

}
