import java.util.Calendar;

import javax.xml.crypto.Data;

public class IfElse {
    public static void main(String[] args) {

        var condicion = true;

        // Si la condicion es verdadera...
        if (condicion) {
            System.out.println("Condicion verdadera"); // Condicion verdadera
        } else {
            System.out.println("Condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else {
            System.out.println(numeroTexto);
        }

        System.out.println(numeroTexto);

        // Condicion estacion del año
        Calendar mes = Calendar.getInstance(); // Obtenemos de la class Calendar y obtenemos el metodo getInstance();
        var estacion = mes.get(Calendar.MONTH) + 1; // Obtenemos el mes actual (en tipo int (nos indica el numero del
                                                    // mes actual)) (el +1 es para que empiece desde el més 1, ya que
                                                    // por defecto empieza por 0 y no existe)

        if (estacion == 12 || estacion == 1 || estacion == 2) {
            System.out.println(estacion + ": Invierno");
        } else if (estacion == 3 || estacion == 4 || estacion == 5) {
            System.out.println(estacion + ": Primavera");
        } else if (estacion == 6 || estacion == 7 || estacion == 8) {
            System.out.println(estacion + ": Verano");
        } else if (estacion == 9 || estacion == 10 || estacion == 11) {
            System.out.println(estacion + ": Otoño");
        } else {
            System.out.println("Estacion desconocida.");
        }
    }
}