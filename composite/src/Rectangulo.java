public class Rectangulo implements Fugura{
    private double altura;
    private double largo;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return this.altura*this.largo;
    }
}
