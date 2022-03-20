package src.operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        AritmeticaConstructores persona1 = new AritmeticaConstructores();

        var resultado = persona1.sumaConRetorno();
        System.out.println("Resultado de suma con retorno con valores de atributos por defecto: " + resultado);
        persona1.a = 20;
        persona1.b = 10;
        resultado = persona1.sumaConRetorno();
        System.out.println("Resultado de suma con retorno: " + resultado);
        resultado = persona1.sumaConArgumentos(10, 16);
        System.out.println("Resultado de suma con argumentos: " + resultado);

        // Utilizar constructor SIN argumentos
        System.out.println("Utilizar constructor SIN argumentos");
        AritmeticaConstructores aritmetica1 = new AritmeticaConstructores();

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        // Utilizar constructor con argumentos
        System.out.println("Utilizar constructor CON argumentos");
        AritmeticaConstructores aritmetica2 = new AritmeticaConstructores(20, 36);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
    }
}
