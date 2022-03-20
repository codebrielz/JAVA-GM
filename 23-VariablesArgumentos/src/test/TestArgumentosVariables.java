package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 6, 2, 10, 3); //<-- Aqui agregamos tantos elementos como queramos
        imprimirNumeros(1, 2); //<-- Podemos hacer una segunda llamada con los elementos que queramos enviar
        variosParametros("Gala",18,20,60);
    }

    //Esta sintaxis: int... estamos indicando que vamos a recibir argumentos variables por lo tanto no sabemos la cantidad de elementos que recibiremos
    //En el momento en el que se ejecuto el codigo, se definiran cuantos elementos recibira el metodo.
    //esta variable: int... numeros se convertirá en un arreglo, con una diferencia, y es que no necesitamos saber cuantos elementos contendrá el arreglo
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
    //Si tenemos más de un argumento y queremos poner el argumento variable, tenemos que indicarlo al final de los argumentos
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre= " + nombre);
        imprimirNumeros(numeros);
    }
}
