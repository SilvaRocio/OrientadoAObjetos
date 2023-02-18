public class Main {
    public static void main(String[] args) {
       UnidadFactoryMethodSingleton creador =  UnidadFactoryMethodSingleton.obtenerInstancia();
       Simple mantenimiento= (Simple) creador.crearUnidad("SIMPLE");
       mantenimiento.setNombre("mantenimiento");
       mantenimiento.setCantPersona(4);
       mantenimiento.setMontoPorPersona(120000.00);

        Simple limpieza= (Simple) creador.crearUnidad("SIMPLE");
        limpieza.setNombre("Limpieza");
        limpieza.setCantPersona(24);
        limpieza.setMontoPorPersona(100000.00);

        CombinadaComposite servicioGeneral= (CombinadaComposite) creador.crearUnidad("COMPUESTO");
        servicioGeneral.setNombre("Servicio General");
        servicioGeneral.setCoeficienteGlobal(3.00);
        servicioGeneral.agregarUnidad(mantenimiento);
        servicioGeneral.agregarUnidad(limpieza);

        mantenimiento.mostrarComponentes();
        limpieza.mostrarComponentes();
        servicioGeneral.mostrarComponentes();


    }
}