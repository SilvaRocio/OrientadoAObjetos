public class Main {
    public static void main(String[] args) {
      CargaFactoryMethodSingleton creador = CargaFactoryMethodSingleton.obtenerInstancia();
      Simple tele = (Simple) creador.crearCarga("SIMPLE");
      tele.setNombre("TV 32' LED");
      tele.setPeso(3);
      tele.setRefrigeracion(false);

        Simple medicamentos = (Simple) creador.crearCarga("SIMPLE");
        medicamentos.setNombre("CAJA DE MEDICAMENTOS");
        medicamentos.setPeso(2);
        medicamentos.setRefrigeracion(true);

        ContenedorComposite contenedor  = (ContenedorComposite) creador.crearCarga("CONTENEDOR");
        contenedor.agregarCarga(medicamentos);
        contenedor.agregarCarga(tele);
        contenedor.setPesoContenedor(100);
      System.out.println("El peso total del contenedor es : "+ contenedor.calcularPeso()+ "KG");

        Barco barco1= new Barco();
        barco1.agregarCarga( tele);
        barco1.agregarCarga(medicamentos);
        barco1.mostrarCarga();

    }
}