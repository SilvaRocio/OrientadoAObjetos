package clase7S;

public class Revista {
        private String nombre;
        private int codigo;
        private String periodo;
        private Editorial editorial;
        private Edicion[] ediciones ;
        public Revista (String nombre, int codigo, String periodo){
            this.nombre=nombre;
            this.codigo=codigo;
            this.periodo=periodo;
            this.editorial= new Editorial();
            this.ediciones= new Edicion[15];
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
