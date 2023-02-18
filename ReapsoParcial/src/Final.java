public class Final extends  Examen implements Comparable<Final>{
    private double notaOral;
    private String temaDado;

    public Final(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    @Override
    public boolean determinarEstadoAprobacion() {
        if (this.notaEscrita>=4 && this.notaOral>=4){
            return true;
        }else{
            return false;
        }
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getTemaDado() {
        return temaDado;
    }

    public void setTemaDado(String temaDado) {
        this.temaDado = temaDado;
    }

    @Override
    public int compareTo(Final examen) {
      double promedio1 = (this.notaOral+this.notaEscrita)/2;
        double promedio2 = (examen.getNotaOral()+examen.getNotaEscrita())/2;
      if (promedio1 >promedio2){
                return 1;
      }else if (promedio1<promedio2){
          return -1;
      }
      return 0;
    }
}
