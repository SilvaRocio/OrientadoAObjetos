public class Main {
    public static void main(String[] args) {
        InstitutoFactoryMethodSingleton institutoGeneral = InstitutoFactoryMethodSingleton.obtenerInstancia();
        Curso frontEnd = (Curso) institutoGeneral.crearOferta("CURSO");
        frontEnd.setCargaHoraria(16.00);
        frontEnd.setDuracion(2);
        frontEnd.setNombre("FrontEnd");
        frontEnd.setValorXHora(900.00);
        frontEnd.setDescripcion("hola");
        System.out.println(frontEnd.toString());
        Curso backEnd = (Curso) institutoGeneral.crearOferta("CURSO");
        backEnd.setCargaHoraria(20.00);
        backEnd.setDuracion(2);
        backEnd.setNombre("BACKEND");
        backEnd.setValorXHora(1000.00);
        backEnd.setDescripcion("hola");
        System.out.println(backEnd.toString());

        CarreraComposite fullStack = (CarreraComposite) institutoGeneral.crearOferta("CARRERA");
        fullStack.agregarCurso(backEnd);
        fullStack.agregarCurso(frontEnd);
        fullStack.setNombre("FULLSTACK");
        fullStack.setDescuento(20.00);

        System.out.println("informe general");
        institutoGeneral.agregarOfertas(backEnd);
        institutoGeneral.agregarOfertas(frontEnd);
        institutoGeneral.agregarOfertas(fullStack);

            institutoGeneral.generarInforme();


    }
}