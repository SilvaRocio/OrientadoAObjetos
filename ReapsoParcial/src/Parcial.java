public class Parcial extends Examen{
    private int numeroUnidad;
    private int numeroReintentos=1;

    public Parcial(String titulo, String enunciado) {
        super(titulo, enunciado);
    ;
    }

    @Override
    public boolean determinarEstadoAprobacion() {
        if (this.notaEscrita>=4){
            return true;
        }else{
            return false;
        }
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public int getNumeroReintentos() {
        return numeroReintentos;
    }

    public void setNumeroReintentos(int numeroReintentos) {
        this.numeroReintentos = numeroReintentos;
    }
    public boolean determinarPosibilidadRecuperar(){
        if (this.numeroUnidad<=3 && this.numeroReintentos<3){
            this.numeroReintentos++;
            return true;
        }else if (this.numeroUnidad>=3 && this.numeroReintentos<2){

            return true;
        }
        return false;
    }
}
