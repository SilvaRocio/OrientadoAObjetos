public class Simple extends Unidad{
    private Double montoPorPersona;
    private int cantPersona;

    public Double getMontoPorPersona() {
        return montoPorPersona;
    }

    public void setMontoPorPersona(Double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public int getCantPersona() {
        return cantPersona;
    }

    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }

    @Override
    public Double calcularMonto() {
        if (this.cantPersona>10){
            return (this.montoPorPersona*this.cantPersona)+(this.montoPorPersona*this.cantPersona)*0.20;
        }
        return (this.montoPorPersona)*this.cantPersona;
    }



    public void mostrarComponentes(){
        System.out.println("El nombre es "+ this.getNombre()+ " y su monto es : "+ this.calcularMonto());
    }
}
