package ejercicioClase10s;

import java.util.Objects;

public class Objeto {
    protected int posx;
    protected int posy;
    protected char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy=posy;
        this.direccion=direccion;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }


    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
    public String irA(int posx, int posy, char direccion){
        return "ir a la direccion "+ this.direccion+" "+ "En las coordenadas" + this.posx + this.posy;
    }
    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return posx == objeto.posx && posy == objeto.posy && direccion == objeto.direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy, direccion);
    }
}
