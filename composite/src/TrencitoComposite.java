import java.util.ArrayList;

public class TrencitoComposite implements Fugura{
    private ArrayList<Fugura> figuras= new ArrayList<>();

    public ArrayList<Fugura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Fugura> figuras) {
        this.figuras = figuras;
    }
    public void agregarFiguras(Fugura figura){
        this.figuras.add(figura);
    }
    public void quitarFiguras(Fugura figura){
        this.figuras.remove(figura);
    }


    @Override
    public double calcularArea() {
        double total=0.0;
        for (Fugura figura: figuras){
            total+=figura.calcularArea();

        }
        return total;
    }
}
