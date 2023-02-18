public class Main {
    public static void main(String[] args) {
       Rectangulo rectangulo1= new Rectangulo();
        Triangulo triangulo1= new Triangulo();
        Circulo circulo1= new Circulo();
        rectangulo1.setAltura(2.0);
        rectangulo1.setLargo(2.0);
        triangulo1.setAltura(4.0);
        triangulo1.setBase(4.0);
        circulo1.setRadio(4.0);
        TrencitoComposite tren1= new TrencitoComposite();
        tren1.agregarFiguras(rectangulo1);
        tren1.agregarFiguras(triangulo1);
        tren1.agregarFiguras(circulo1);

        System.out.println("El area total es : "+ tren1.calcularArea() );
    }
}