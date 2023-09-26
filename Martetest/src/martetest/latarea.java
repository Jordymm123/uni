package martetest;
public class latarea {
    class Tarea {
    String nombre;
    int tiempoEjecucion,tipo;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTiempoEjecucion(int tiempoEjecucion) {
            this.tiempoEjecucion = tiempoEjecucion;
        }
        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getTiempoEjecucion() {
            return tiempoEjecucion;
        }
        public int getTipo() {
            return tipo;
        }

        @Override
        public String toString() {
            return "'"+ nombre +"'"+ ", tiempo " + tiempoEjecucion + " seg ";
        }

    public Tarea(String nombre, int tiempoEjecucion, int tipo) {
        this.nombre = nombre;
        this.tiempoEjecucion = tiempoEjecucion;
        this.tipo=tipo;
    }
    }
}
