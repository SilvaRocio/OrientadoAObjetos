public class ArmaLarga extends Arma implements Comparable<ArmaLarga>{
    private boolean sello;
    private String descripcion;
    private int nivelArmado;

    public ArmaLarga(int cantidadMuniciones, double alcanceMetros, String marca, String estado, int calibre, Policia policia, boolean sello, String descripcion, int nivelArmado) {
        super(cantidadMuniciones, alcanceMetros, marca, estado, calibre, policia);
        this.sello = sello;
        this.descripcion = descripcion;
        this.nivelArmado = nivelArmado;
    }

    public boolean isSello() {
        return sello;
    }

    public void setSello(boolean sello) {
        this.sello = sello;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelArmado() {
        return nivelArmado;
    }

    public void setNivelArmado(int nivelArmado) {
        this.nivelArmado = nivelArmado;
    }

    @Override
    public boolean condicionesUso() {
            if (this.getEstado()=="EN USO" && this.getCalibre()>=9){
                return true;
            }else{
                return false;
            }
    }

    @Override
    public int compareTo(ArmaLarga armaLarga) {
        if (this.nivelArmado> armaLarga.getNivelArmado()){
            return 1;
        }else if (this.nivelArmado< armaLarga.getNivelArmado()){
            return -1;
        }
        return 0;
    }
}
