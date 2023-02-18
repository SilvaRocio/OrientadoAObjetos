package ejercicioClase10s;

import java.util.Objects;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad=velocidad;
        this.vida=vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public String irA(int posx, int posy, char direccion){
        return "ir a la direccion "+ this.direccion+" "+ "En las coordenadas" + this.posx + this.posy;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidad, velocidad) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), velocidad, vida);
    }
}
