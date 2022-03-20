
package domain;

// extends: Extiende una clase para poder obtener sus propiedades.
// Persona es la clase padre y la clase Empleado es hijo de la clase Persona.
// Entonces Empleado obtiene todas las propiedades de Persona (Menos las private)
public class Empleado extends Persona {
    // Atributos de la clase hija.
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    // Constructor vacio
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    // Constructor con argumentos
    public Empleado(String nombre, double sueldo) {
        // Super usualmente es siempre llamado en primera linea, EXCEPTO cuando vamos a
        // llamar a un constructor interno, en este caso vamos a utilizar this y
        // mediante this podemos llamar al constructor vacio (No se pueden llamar al
        // constructor this y super en un mismo constructor)
        this(); // Esto llamará al constructor vacio interno de esta clase
        // super contiene toda la informacion heredada de la clase padre. Hace
        // referencia al constructor de la clase padre
        // super(nombre);
        this.nombre = nombre;

        this.sueldo = sueldo;
    }

    // Metodos de acceso set y get

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Sobreescribimos el comportamiento heredado de la clase padre (En este caso de
    // la clase Persona)
    // StringBuilder mejora el comportamiento por default de toString (optimiza la
    // concatenacion de cadenas)
    @Override
    public String toString() {
        // Crea una variable de tipo StringBuilder y crea una instancia en la clase
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        // sb.append() es para añadir informacion a la variable (es para concatenar y
        // agregar informacion)
        sb.append("Empleado{ ");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo).append(" }");
        sb.append(", ").append(super.toString()); // con super podemos acceder a los metodos y atributos de la clase
                                                  // padre.
        return sb.toString();
    }

}
