public class PapelRegalo extends Producto{

   private double peso;


    @Override
    public double calcularEspacio() {
        return 0;
    }




    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
