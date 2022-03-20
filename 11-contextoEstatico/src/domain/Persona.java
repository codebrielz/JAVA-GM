package domain;

public class Persona {
    // Atributos NO estaticos
    private int idPersona;
    private String nombre;

    // Atributos estaticos
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        // Un contador de creaciones de instancia sería buen lugar ponerlo a comenzar a
        // contar en el constructor.
        // Ya que cada vez que creemos una instancia de esta clase, esté constructor se
        // ejecutará
        // Incrementamos el contador por cada objeto nuevo
        // Es posible utilizar this para llamar al atributo contadorPersonas, pero al
        // utilizar static para ese mismo atributo, no es recomendable hacerlo ya que
        // las variables staticas se asocian con la clase
        Persona.contadorPersonas++; // Forma recomendada para los atributos asociados a las clases, es poner el
                                    // nombre de la clase y seguido de un punto el atributo estatico al que acceder
        // Asignar el valor de la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    // Metodos de acceso y modificacion para NO staticos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos de acceso y modificacion para Staticos
    public static int getContadorPersonar() {
        return contadorPersonas;
    }

    public static void setContadorPersonar(int aContadorPersonas) {
        Persona.contadorPersonas = aContadorPersonas;
    }

    @Override // Esto es una anotacion al metodo que estamos creando (indica que estamos
              // SOBREESCRIBIENDO el metodo toString())
    public String toString() {
        return "Persona { " + "idPersona: " + idPersona + " nombre: " + nombre + " }";
    }

}