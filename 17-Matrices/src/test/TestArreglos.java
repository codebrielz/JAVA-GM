package test;

public class TestArreglos {
    public static void main(String[] args) {
        //Arreglo de tipos enteros (arreglos de tipo primitivo)
        //Los arreglos en JAVA no pueden crecer dinamicamente.
        int edades[] = new int[3]; //creamos una nueva instancia a Object de tipo int y le indicamos cuantos elementos almacenaremos en nuestro arreglo.
        System.out.println("edades = " + edades); //Direccion de memoria: edades = [I@15aeb7ab
        
        //Añadimos el valor a los elementos del arreglo:
        edades[0] = 30;
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 10;
        System.out.println("edades[1] = " + edades[1]);
        edades[2] = 12;
        System.out.println("edades[2] = " + edades[2]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("i = " + edades[i]);
        }
        
        //Sintaxis resumida de creacion de arreglo
        String frutas[] = {"Naranja", "Platano", "Uva"}; //<-- Asi podemos agregar directamente los elementos en el arreglo sin necesidad de añadirlos despues.
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + "= " + frutas[i]);
        }
    }
    
}
