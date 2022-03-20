import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        // Ejemplo de false
        var booleanFalse = false;
        // Primero se ejecuta el codigo y despues se resuelve la condicion (es decir, se
        // false o true, la primera linea de codigo se realizará)
        do {
            System.out.println("Aunque sea false, me ejecuto igualmente");
        } while (booleanFalse);

        // Ahora un programa más elavorado
        Scanner consola = new Scanner(System.in);
        // Pregunta:
        System.out.println("Cuantas personas vendrán al evento?");
        var numPersona = Integer.parseInt(consola.nextLine());
        System.out.println("Confirmacion de personas que vendrán al evento?");
        var contador = Integer.parseInt(consola.nextLine());

        do {
            if (contador > numPersona) {
                System.out.println("No es posible, has superado el aforo permitido");
                break;
            } else {
                System.out.println("Vendrán al evento: " + contador);
                contador++;
            }
        } while (numPersona >= contador);

    }
}
