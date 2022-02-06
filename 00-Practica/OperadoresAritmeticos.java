import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int a = 2, b = 6;

        // Sumar
        var resultado = a + b;

        System.out.println("La suma entre: " + a + " + " + b + " es de: " + resultado);
        // Restar
        resultado = a - b;
        System.out.println("La resta entre: " + a + " - " + b + " es de: " + resultado);
        // Multiplicar
        resultado = a * b;
        System.out.println("La multiplicacion entre: " + a + " * " + b + " es de: " + resultado);
        // Dividir
        var resultado2 = (double) a / b;
        System.out.println("La division entre: " + a + " / " + b + " es de: " + resultado2);
        // resto
        resultado = a % 2;
        System.out.println("El resto entre: " + a + " % " + "2 es de: " + resultado);

        // Programa para practicar
        // Si el resto de a es igual a 0 (es impar) (el resto se mide siempre con 2)
        if (a % 2 == 0) {
            System.out.println("Tienes un número par");
        } else {
            System.out.println("Tienes un número impar");
        }

        // Programa

        int c = 0, d = 0;
        int resultadoPrograma;

        Scanner consola = new Scanner(System.in);

        // Condicion para seleccionar un operador

        System.out.println("Elije un operador: + - * /");
        var res = consola.nextLine();
        if (res.equals("+")) {
            System.out.println("Has seleccionado el operador: " + res);
            c = Integer.parseInt(consola.nextLine());
            d = Integer.parseInt(consola.nextLine());
            resultadoPrograma = c + d;
            System.out.println("resultadoPrograma " + resultadoPrograma);

        } else if ((res.equals("-"))) {
            System.out.println("Has seleccionado el operador: " + res);
            c = Integer.parseInt(consola.nextLine());
            d = Integer.parseInt(consola.nextLine());
            resultadoPrograma = c - d;
            System.out.println("resultadoPrograma " + resultadoPrograma);
        } else if ((res.equals("*"))) {
            System.out.println("Has seleccionado el operador: " + res);
            c = Integer.parseInt(consola.nextLine());
            d = Integer.parseInt(consola.nextLine());
            resultadoPrograma = c * d;
            System.out.println("resultadoPrograma " + resultadoPrograma);
        } else if ((res.equals("/"))) {
            System.out.println("Has seleccionado el operador: " + res);
            c = Integer.parseInt(consola.nextLine());
            d = Integer.parseInt(consola.nextLine());
            resultadoPrograma = c / d;
            System.out.println("resultadoPrograma " + resultadoPrograma);
        }

    }
}
