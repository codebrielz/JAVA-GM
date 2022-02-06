public class TipoChar {
    public static void main(String[] args) {

        // char almacena simplemente un caracter (CUALQUIER TIPO DE CARACTER desde
        // letras hasta caracteres especiales)
        // char tiene la particularidad de que sus valores tienen que ir con comillas
        // simples (si no, nos genera error)
        char caracterEspecial = '@';
        System.out.println("caracterEspecial: " + caracterEspecial);
        char caracterNormal = 'a';
        System.out.println("caracterNormal: " + caracterNormal);

        // Los caracteres numericos son especiales ya que no muestran como caracter un
        // numero, si no un valor que contiene el numero indicado
        char caracterNumericoEspecial = 4; // 4 = rombo
        System.out.println("caracterNumericoEspecial: " + caracterNumericoEspecial);

        /*
         * La lista UNICODE se utiliza de forma especial (hay que hacer uso de
         * caracteres especiales (valga la redundancia))
         * Podemos encontrar más informacion sobre la lista UNICODE en este link:
         * https://en.wikipedia.org/wiki/List_of_Unicode_characters
         */

        // Para indicar que vamos a utilizar caracteres de la lista UNICODE se utiliza
        // (\ u) (junto)
        char caracterUnicode = '\u0021'; // !
        System.out.println("caracterUnicode: " + caracterUnicode);

        // Tambien se puede indicar como anteriormente hemos visto con el 4, que se
        // puede hacer con numeros decimales
        char caracterDecimal = 33; // !
        System.out.println("caracterDecimal: " + caracterDecimal);

        // o bien:
        char caracterDirecto = '!'; // !
        System.out.println("caracterDirecto: " + caracterDirecto);

        // INFERIR TIPOS DE CHAR EN VAR
        var caracterUnicodeConVar = '\u0021'; // !
        System.out.println("caracterUnicodeConVar: " + caracterUnicodeConVar);

        var caracterDecimalConVar = (char) 33; // ! //A esto (char) 33 se le conoce como conversion de tipos
        System.out.println("caracterDecimalConVar: " + caracterDecimalConVar);

        var caracterDirectoConVar = '!'; // !
        System.out.println("caracterDirectoConVar: " + caracterDirectoConVar);

        // El tipo char está siendo transformado a tipo int, por eso cambia de ! a su
        // valor numerico 33
        int variableEnteraSimbolo = '!'; // 33
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo);

        int letra = 'a'; // a = 97
        System.out.println("letra: " + letra);

    }
}
