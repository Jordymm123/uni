package laimpresora;
public class DocumentosYPaginas {
    class Documento {
    String nombre;
    int numPaginas;
    int paginasRestantes;
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
        }

        public void setPaginasRestantes(int paginasRestantes) {
            this.paginasRestantes = paginasRestantes;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumPaginas() {
            return numPaginas;
        }

        public int getPaginasRestantes() {
            return paginasRestantes;
        }

    public Documento(String nombre, int numPaginas) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.paginasRestantes = numPaginas;
    }

        @Override
        public String toString() {
            return "'"+nombre+"'" + " con " + numPaginas + " paginas";
        }
    }
}