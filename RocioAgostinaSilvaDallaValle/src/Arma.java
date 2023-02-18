public abstract class Arma {
    protected int cantidadMuniciones;
    protected double alcanceMetros;
    protected String marca;
    protected String estado;
    protected int calibre;
    protected Policia policia;

    public Arma(int cantidadMuniciones, double alcanceMetros, String marca, String estado, int calibre, Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.estado = estado;
        this.calibre = calibre;
        this.policia = policia;
    }
    public abstract boolean condicionesUso();
    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public double getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(double alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }
}
