public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // La precendencia de operadores es el orden en el que se van a evaluar los
        // operadores en una expresion cuando estamos trabajando con Java

        var x = 5;
        var g = 10;
        var z = ++x + g--; // preincrementa (x) y postdecrementa (g) ((x) se suma en la primera
                           // llamada y (g) se resta en la siguiente llamada) RESULTADO: 16
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3; // 4 + ( ( 5 * 6 ) / 3 ) = 14
        System.out.println("resultado : " + resultado);
        resultado = (4 + 5) * 6 / 3; // ( ( ( 4 + 5 ) * 6 ) / 3 ) = 18
        System.out.println("resultado : " + resultado);

    }
}
