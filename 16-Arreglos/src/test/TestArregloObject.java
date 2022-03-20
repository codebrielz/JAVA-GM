
package test;

import domain.Persona;

public class TestArregloObject {
    public static void main(String[] args) {
        //Arreglo de objetos de tipo persona
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Alba");
        System.out.println("personas = " + personas[0].getNombre() + " Direccion de memoria: " + personas[0]);
        //Modificar por referencia desde el metodo set
        personas[0].setNombre("Lara");
        System.out.println("personas = " + personas[0].getNombre() + " Direccion de memoria: " + personas[0]);
        
        personas[1] = new Persona("Gala");
        System.out.println("personas = " + personas[1].getNombre() + " Direccion de memoria: " + personas[1]);
        
        for(int i = 0; i < personas.length; i++) {
            System.out.println("Direccion de memoria de los elementos del arreglo personas[]= " + personas[i]);
            System.out.println("personas = " + personas[i].getNombre());
        }
    
    }
}
