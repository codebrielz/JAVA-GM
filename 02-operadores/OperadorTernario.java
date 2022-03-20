public class OperadorTernario {
    public static void main(String[] args) {
        // El operador ternario simplifica estructuras if/else
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println(resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "es par" : "es impar";
        System.out.println(resultado);

    }
}
