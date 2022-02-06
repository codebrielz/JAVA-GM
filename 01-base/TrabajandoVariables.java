public class TrabajandoVariables {
    public static void main(String args[]) {

        // Tipo int
        int miVariableEntera = 30; // literal numerica (de tipo int)(cualquier tipo de dato que no tenga punto
                                   // flotante es de tipo int)
        System.out.println("Mi variable entera: " + miVariableEntera);

        // Tipo String
        String miVariableString = "Saludos"; // literal de tipo cadena (de tipo String)
        System.out.println("Mi variable String: " + miVariableString);
        // Modificamos su valor:
        miVariableString = "Adios";
        System.out.println("Mi variable String con un valor nuevo: " + miVariableString);

        // var - inferencia de tipos en Java (a partir del valor que le vamos a asignar
        // de nuestra literal)
        // El uso de var simplifica la definicion de variables.
        var numeroEnteroConVar = 30;
        System.out.println("Variable Entera Inferida por Var: " + numeroEnteroConVar);

        var cadenaConVar = "Hola Mundo";
        System.out.println("Variable String Inferida por Var: " + cadenaConVar);

        // reglas de definicion de variables
        // NO ES RECOMENDABLE: utilizar acentos en las variables.

        // Empezar con la primera letra minuscula (una regla no escrita pero
        // recomendada)
        var variableConFirstLetraMin = "Valor permitido";

        // No se puede comenzar los nombres de las variables con un numero o caracter
        // especial (excepto guion bajo y signo de dolar)
        var _miVariableNoComun = "Valor permitido";
        var $miVariableNoComunConSignoDolar = "Valor permitido";

    }
}
