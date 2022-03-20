package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        cambioValor(x); // Simplemente se pasa la copia del valor de la variable
        // Aqui tendríamos que añadir el nuevo valor a nuestra variable x:
        // x = cambioValor(x);

        System.out.println("x nuevo valor = " + x);
    }

    public static void cambioValor(int arg1) { // Recibe la copia del valor de la variable
        System.out.println("arg1 = " + arg1); // 10
        arg1 = 15; // No modifica el valor definido desde otro metodo
        // Para enviar el cambio podemos hacer lo siguiente: (primero el metodo tiene
        // que retornar un integer (quitamos void por int))
        // Y retornamos el valor modificado
        // return arg1 = 15;
    }
}
