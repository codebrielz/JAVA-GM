
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        //ForEach es un for mejorado
        int edades[] = {5,6,8,10,12};
        
        //Creamos un ciclo for con la diferencia de que vamos a asignar en sus parentesis
        //una variable del mismo tipo que el arreglo para poder indicar el arreglo que tenemos que recorrer
        //edad(es la variable creada): edades(el arreglo que queremos recorrer)
        for (int edad: edades) {
            System.out.println("edad=" + edad);
        }
        
        //Si estubieramos trabajando con herencia, un tipo padre puede almacenar un tipo hijo sin ningun problema (pero no a la inversa)
        Persona persona[] = {new Persona("Juan"),new Persona("Karla"), new Persona("Agustin")};
        for (Persona nombrePersona: persona) {
            System.out.println("nombre persona: " + nombrePersona);
        }
    }
}
