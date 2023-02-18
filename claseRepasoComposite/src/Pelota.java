public class Pelota extends Producto{
    private double peso;
    private double radio;


    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularEspacio() {
        return (4/3)*(3.14)*this.radio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
