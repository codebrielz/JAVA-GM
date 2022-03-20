package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/*
Las RuntimeException son errores que se disparán en tiempo de ejecución y no de compilación.
*/

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        /*
        try & catch contiene otra palabra más llamada finally, finally se ejecutará siempre, si o si, pase lo que pase,
        además try & catch, puede contener más de un catch para revisar varias excepciones, se recomienda ir de menor jerarquia a mayor jerarquia (excepcion)
        */
        //Con RuntimeException no tenemos la obligacion de poner trycatch
        try {
        resultado = Aritmetica.division(10, 0); //division entre cero, ahora lanza el error creado por nosotros
        }
        catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error de tipo Exception:");
            //e.printStackTrace(System.out); //<-- Imprime la pila de excepciones, esto->(System.out) es para que se mande a imprimir a la consola
            System.out.println(e.getMessage());;
        }finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
