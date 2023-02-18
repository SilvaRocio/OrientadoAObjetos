public class Circulo implements Fugura{
    private double radio;
    private final double PI=3.14;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double calcularArea() {
        return this.radio*this.radio*this.PI;
    }
}
