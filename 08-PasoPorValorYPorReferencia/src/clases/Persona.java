package clases;

// Todas las clases heredan de la clase Object
public class Persona {
    // Atributos de la clase
    // Debido a que estamos en otro paquete (la carpeta pasoporreferencia es un
    // paquete y clases es otro paquete) entonces para poder acceder a los atributos
    // de un paquete externo, tenemos que indicar el tipo de acceso de esos mismos
    // atributos (ESTO NO ES BUENA PRACTICA)
    public String nombre;
    public String apellido;

    // Metodos de la clase
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}
