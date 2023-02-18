import java.util.ArrayList;

public class CombinadaComposite extends Unidad{
    private Double coeficienteGlobal;
    private Double montoMaterial;
    private ArrayList<Unidad> unidades= new ArrayList();

    public Double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public void setCoeficienteGlobal(Double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public Double getMontoMaterial() {
        return montoMaterial;
    }

    public void setMontoMaterial(Double montoMaterial) {
        this.montoMaterial = montoMaterial;
    }
    public void agregarUnidad(Unidad unidad){
        this.unidades.add(unidad);
    }
    public void eliminarUnidad(Unidad unidad){
        this.unidades.remove(unidad);
    }

    @Override
    public Double calcularMonto() {
        Double suma=0.0;
        for (Unidad x:this.unidades) {
            suma+=x.calcularMonto();
        }
        return suma*this.coeficienteGlobal;
    }
    public void mostrarComponentes(){
        System.out.println("El nombre es : "+ getNombre()+" y su monto es :  "+ this.calcularMonto());
    }
}
