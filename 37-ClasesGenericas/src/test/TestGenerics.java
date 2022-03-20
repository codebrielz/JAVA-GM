
package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        //Entonces cuando creamos una variable de tipo ClaseGenerica<> dentro de los picos parentesis tenemos que definir el tipo de T.
        //No podemos definir tipos primitivos, tenemos que utilizar tipos genericos.
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
    
        ClaseGenerica<String> objetoString = new ClaseGenerica("Hola Mundo");
        objetoString.obtenerTipo();
    }
}
