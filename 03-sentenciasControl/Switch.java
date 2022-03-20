import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Escriba un numero del 1 al 4");

        Scanner consola = new Scanner(System.in);

        var numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "";
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Numero fuera de rango o desconocido";
                break;
        }
        System.out.println(numeroTexto);

        Calendar data = Calendar.getInstance();
        var mes = data.get(Calendar.MONTH) + 1;
        var estacionActual = "";

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacionActual = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacionActual = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacionActual = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacionActual = "Otoño";
                break;
            default:
                estacionActual = "Estacion desconocida";
                break;
        }
        System.out.println("estacionActual: " + estacionActual);
    }
}
