public class Simple extends Carga{

    private boolean refrigeracion;

   private double peso;


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public double calcularPeso() {
           if (this.refrigeracion==true){
               return this.peso+2;
           }
           return this.peso;
    }
}
