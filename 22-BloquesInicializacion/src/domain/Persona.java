package domain;

public class Persona {

    /*
    Tenemos dos tipos de bloques de inicializacion estaticos y no estaticos.
    Ambos bloques se ejecutarán ANTES que el constructor
     */

    //atributos
    private final int idPersona;
    private static int contadorPersona;

    //Bloque inicializacion estatico
    //A parte de ejecutarse antes del constructor tambien se ejecuta antes que los bloques no estaticos
    //En los bloques estaticos no tenemos acceso al operador this
    //SOLO SE EJECUTA LA PRIMERA VEZ QUE SE EJECUTA LA CLASE es decir, la segunda INSTANCIA que creemos de la clase NO SE VOLVERÁ A EJECUTAR static{} 
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        System.out.println("contadorPersona = " + contadorPersona);
        System.out.println("");
    }

    //bloque de inicializacion NO ESTATICO
    {
        System.out.println("Ejecucion bloque NO ESTATICO");
        this.idPersona = Persona.contadorPersona++; //Y dejamos como pendiente un nuevo incremento
        System.out.println("idPersona = " + idPersona);
        System.out.println("");

    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
        System.out.println("");

    }

    public int getIdPersona() {
        return this.idPersona;
    }
}
