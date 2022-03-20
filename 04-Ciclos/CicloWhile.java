import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {

        var num = 0;
        var numMaximo = 10;

        while (num <= numMaximo) {
            System.out.println("Num actual: " + num);
            num++; // PostIncremento
        }

        // Programa para contar la edad de una persona
        Scanner consola = new Scanner(System.in);

        // Preguntar el nombre y el numero hasta el que quiere contar
        System.out.println("Como te llamas? ");
        var nombre = consola.nextLine();
        System.out.println("Elije el numero inicial para empezar a contar");
        var personaContador = Integer.parseInt(consola.nextLine());
        System.out.println("Elije el numero final para parar de contar");
        var contador = Integer.parseInt(consola.nextLine());
        while (personaContador <= contador) {
            System.out.println(nombre + " lleva la cuenta de " + personaContador);
            personaContador++; // Postincremento
        }

    }
}