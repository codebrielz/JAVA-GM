
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        //Creacion de una matriz
        //El primer arreglo controla los renglones y el segundo las columnas
        int edades[][] = new int[3][2]; //Creacion del objeto
        
        edades[0][0] = 1;
//        System.out.println("edades[0][0] = " + edades[0][0]);
        edades[0][1] = 2;
//        System.out.println("edades[0][1] = " + edades[0][1]);
        edades[1][0] = 3;
//        System.out.println("edades[1][0] = " + edades[1][0]);
        edades[1][1] = 4;
//        System.out.println("edades[1][1] = " + edades[1][1]);
        edades[2][0] = 5;
//        System.out.println("edades[2][0] = " + edades[2][0]);
        edades[2][1] = 6;
//        System.out.println("edades[2][1] = " + edades[2][1]);
        
        
            for (int renglon = 0; renglon < edades.length; renglon++) {
                for (int columnas = 0; columnas < edades[renglon].length; columnas++) {
                    System.out.println("edades " + renglon + "-" + columnas + ": " + edades[renglon][columnas]);
                }
            }
        
        //sintaxis simplificada de las matrices
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}}; 
        
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Polonia");
        personas[1][0] = new Persona("Sandra");
        personas[1][1] = new Persona("Sara");
        personas[1][2] = new Persona("Mau");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        //iterar matriz con for anidados
        for (int ren = 0; ren < matriz.length; ren++) {
                for (int col = 0; col < matriz[ren].length; col++) {
                       System.out.println("personas: " + ren + "-" + col + ": " + matriz[ren][col]);
                }
            }
    }
}
