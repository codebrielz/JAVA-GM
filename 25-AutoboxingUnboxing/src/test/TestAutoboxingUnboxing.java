package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        /*
        Tiene que ver con los tipos primitivos, cada uno de los tipos primitivos tiene una clase en JAVA asociada 
        conocida como clase wrapper es decir, clase envolvente del tipo primitivo        
         */
 /*
        TIPOS ENVOLVENTES DE LOS TIPOS PRIMITIVOS:
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Character
            short - Short
         */

        Integer entero = 10; //<--Autoboxing: Ya que estamos envolviendo un tipo primitivo en un tipo Object
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString()); //<--Y lo podemos convertir en un String facilmente
        System.out.println("entero = " + entero.doubleValue()); //<--Y lo podemos convertir en un Double facilmente

        //Unboxing, extraer el valor del tipo Object (En este caso Integer);
        int entero2 = entero; //<--Unboxing: Extrae el valor del Objeto Integer y lo almacena al tipo int por eso se le conoce como unboxing

    }
}
