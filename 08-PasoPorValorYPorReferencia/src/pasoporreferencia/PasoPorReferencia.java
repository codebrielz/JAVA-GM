package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // persona1 apunta al objeto Persona();

        // Debido a que estamos en otro paquete (la carpeta pasoporreferencia es un
        // paquete y clases es otro paquete) entonces para poder acceder a los atributos
        // de un paquete externo, tenemos que indicar el tipo de acceso de esos mismos
        // atributos (ESTO NO ES BUENA PRACTICA)

        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        cambiaValor(persona1); // La variable persona1 almacena la REFERENCIA del objeto que se creo Persona();
        persona1.desplegarInformacion(); // la informacion muestra los nuevos valores ya que el argumento y la variable
                                         // están pasados por referencia, entonces para modificarlo no es necesario
                                         // hacer un return
    }

    public static void cambiaValor(Persona persona) { // Tanto la variable persona1 como el argumento persona están
                                                      // apuntando al mismo objeto (ya que es pasado por referencia), es
                                                      // decir se refieren al mismo objeto
        System.out.println("persona: " + persona);
        persona.nombre = "Sonia";
        persona.apellido = "Blanca";

    }
}
