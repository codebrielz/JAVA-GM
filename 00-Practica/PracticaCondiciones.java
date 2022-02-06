import java.lang.constant.Constable;
import java.util.Scanner;

public class PracticaCondiciones {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Iniciar o Registrar");
        System.out.println("Escriba una opcion:");
        var iniciarOrRegistrar = consola.nextLine();
        var iniciar = "INICIAR";
        var registrar = "REGISTRAR";

        if (iniciarOrRegistrar.toUpperCase().equals(iniciar)) {
            System.out.println("Escriba su nombre de usuario: ");
            var usuario = consola.nextLine();
            System.out.println("Escriba su contraseña: ");
            var contrasenia = consola.nextLine();

            System.out.println("Bienvenido a nuestra aplicacion " + usuario);

        } else if (iniciarOrRegistrar.toUpperCase().equals(registrar)) {
            // Informacion real
            System.out.println("Escriba su nombre: ");
            var nombreReal = consola.nextLine();

            System.out.println("Escriba su edad: ");
            var edadReal = consola.nextLine();

            // Informacion usuario app:
            System.out.println("Escriba su nombre de usuario: ");
            var usuario = consola.nextLine();

            // contraseña (doble confirmacion)
            System.out.println("Escriba su contraseña: ");
            var contrasenia = consola.nextLine();
            System.out.println("Vuelva a escribir su contraseña: ");
            var contrasenia1 = consola.nextLine();

            // Si son iguales
            if (contrasenia.equals(contrasenia1)) {
                // Le indicamos que el registro se completo y le damos la bienvenida
                System.out.println("Registro completo.");
                System.out.println("Bienvenido a nuestra aplicacion " + usuario);
            }
            // Si contrasenia es diferente a contrasenia1
            else {
                // Le indicamos que vuelva a escribir la segunda contraseña
                System.out.println("Contraseña incorrecta, vuelvela a escribir: ");
                contrasenia1 = consola.nextLine();
                if (contrasenia.equals(contrasenia1)) {
                    // Le indicamos que el registro se completo y le damos la bienvenida
                    System.out.println("Registro completo.");
                    System.out.println("Bienvenido a nuestra aplicacion " + usuario);
                }
            }
        }
    }
}