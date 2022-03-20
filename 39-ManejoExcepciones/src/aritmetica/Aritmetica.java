package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
//    public static int division(int numerador, int denominador) throws OperacionExcepcion {} <-- throws es para indicar que posiblemente nuestro metodo maneje esta excepcion
    //Con RuntimeExcepcion no nos obliga a poner en nuestra creacion del metodo las banderas de throws OpereacionExcepcion.
    public static int division(int numerador, int denominador){
        if(denominador == 0){
            //throw = mandar
            throw new OperacionExcepcion("Division entre cero"); 
        }
        return numerador / denominador;
    }
}
