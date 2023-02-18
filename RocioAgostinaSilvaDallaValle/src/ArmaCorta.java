public class ArmaCorta extends Arma{
    private boolean automatica;

    public ArmaCorta(int cantidadMuniciones, double alcanceMetros, String marca, String estado, int calibre, Policia policia, boolean automatica) {
        super(cantidadMuniciones, alcanceMetros, marca, estado, calibre, policia);
        this.automatica = automatica;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    @Override
    public boolean condicionesUso() {
        if (this.getEstado()=="EN USO" && this.getCalibre()>=9){
            return true;
        }else{
            return false;
        }
    }
    public boolean disparar(){
        if (this.getAlcanceMetros()>=200){
            return true;
        }else{
            return false;
        }
    }
}
