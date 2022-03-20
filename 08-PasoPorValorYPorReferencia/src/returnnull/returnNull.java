package returnnull;

import clases.Persona;

public class returnNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // persona1 apunta al objeto Persona();

        // Debido a que estamos en otro paquete (la carpeta pasoporreferencia es un
        // paquete y clases es otro paquete) entonces para poder acceder a los atributos
        // de un paquete externo, tenemos que indicar el tipo de acceso de esos mismos
        // atributos (ESTO NO ES BUENA PRACTICA)

        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        persona1 = cambiaValor(persona1);
        persona1.desplegarInformacion();

    }

    // Podemos crear metodos que retorner el valor de una clase creada por nosotros
    // (como en este caso Persona())
    public static Persona cambiaValor(Persona persona) {
        // Si persona su valor esta vacio, regresamos simplemente persona
        if (persona == null) {
            System.out.println("Valor de persona invalido");
            return persona;
        }
        persona.nombre = "Sonia";
        persona.apellido = "Blanca";
        // Retornamos el argumento que apunta a la misma referencia que la variable
        // persona1
        return persona;

    }

}
