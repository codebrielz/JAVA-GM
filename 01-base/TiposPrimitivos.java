public class TiposPrimitivos {
    public static void main(String[] args) {

        // Dos tipos de primos primitivos
        // primos primitivos que almacenan solamente enteros
        /*
         * Tipos primitivos enteros: byte(8bits), short(16bits), int(32bits),
         * long(64bits)
         */
        // Creacion de variable de tipo byte
        byte numeroByte = 10;
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE); // -128
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE); // 127

        // Creacion de variable de tipo short
        short numeroShort = 10;
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE); // -32768
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE); // 32767

        // Creacion de variable de tipo int
        int numeroInt = 10;
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE); // 2147483647

        // Creacion de variable de tipo long
        long numeroLong = 10;
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE); // 9223372036854775807

        // primos primitivos que almacenan tipos flotantes
        /*
         * Tipos primitivos flotantes: float, double
         */

        // Creacion de variable de tipo float
        float numeroFloat = 3.1F; // Recomendable poner la letra del tipo en MAYUSCULA para no confundir numeros
                                  // con letras
        System.out.println("Valor minimo del float: " + Float.MIN_VALUE); // 1.4E-45 (E es Exponencial)
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE); // 3.4028235E38 (E es Exponencial)

        // Creacion de variable de tipo double
        double numeroDouble = 30.00;
        System.out.println("Valor minimo del double: " + Double.MIN_VALUE); // 4.9E-324 (E es Exponencial)
        System.out.println("Valor maximo del double: " + Double.MAX_VALUE); // 1.7976931348623157E308 (E es Exponencial)
    }
}
