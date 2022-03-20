package dominio;

// Dominio es el nombre de la carpeta que usualmente tiene clases que resuelven
// el problema que estamos analizando (clases de dominio)
public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Metodos get y set
    // Tenemos que indicar que tipo de valor retorna y si no retorna, ponemos void
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Para los tipos boolean se utiliza is en lugar de get
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // Tambien es muy común tener el metodo toString, este metodo nos permite
    // imprimir el estado del objeto y los valores de cada uno de los atributos que
    // agreguemos al metodo toString

    public String toString() {
        return "Persona [nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", eliminado: " + this.eliminado + "]";
    }
}
