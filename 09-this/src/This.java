public class This {
    public static void main(String[] args) {
        // Cuando enviamos informacion a nuestro constructor, JAVA guarda la cadena que
        // hemos enviado en un espacio en memoria llamada pull string, entonces, cuando
        // ponemos dos valores con exactamente el mismo tipo de cadena de texto, estamos
        // haciendo referencia al mismo espacio en memoria.
        Persona persona = new Persona("Susan", "Susan"); // Cuando creamos dos Strings con los mismos caracteres, JAVA
                                                         // guarda dentro
                                                         // En cambio, si queremos crear dos espacios en memoria
                                                         // diferentes pero con el
        System.out.println("persona: " + persona);
        // mismo nombre podemos utilizar new String("Susan"), y creará otro espacio en
        // memoría, pero con la misma referencia
        Persona persona1 = new Persona(new String("Susan"), new String("Susan"));
        System.out.println("persona1: " + persona1);

        // persona.generarInforme();
        persona1.generarInforme();
    }
}

// Las definiciones de otras clases se hacen fuera de otras clases
// En JAVA solamente la primera clase puede ser publica, las demás no pueden
// serlo

class Persona {

    // Atributos de la clase (el this contiene la data de estos atributos)
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        // super() es el constructor de la clase padre (object), aunque no lo veamos, es
        // una llamada implicita
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }

    public void generarInforme() {
        System.out.println("persona: " + this.nombre.hashCode() + " " + this.apellido.hashCode());
    }

}

class Imprimir {
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}