import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main(String[] args) {

        // DE TIPO String A TIPO int
        // Integer.parseInt("String numerico para hacer la conversion");
        var edad = Integer.parseInt("20"); // Hace la conversion de String numerico a int

        System.out.println("El valor de edad: " + edad);
        /**
         * Para saber el tipo de dato de alguna variable utilizamos la siguiente
         * "formula":
         * ((Object)variableQueQueremosSaberSuTipo).getClass().getSimpleName()
         * Object es para definir que la variable es un objeto (ya que no sabemos que
         * tipo es)
         * .getClass() es un metodo para obtener su clase
         * .getSimpleName() es un metodo para simplificar el nombre de la clase (es
         * decir indica su tipo)
         * Si solo pusieramos:
         */
        // Sin getSimpleName:
        System.out.println("El tipo de edad: " + ((Object) edad).getClass()); // class java.lang.Integer
        // Con getSimpleName:
        System.out.println("El tipo de edad: " + ((Object) edad).getClass().getSimpleName()); // Integer

        // conversion de string a Double:
        // CONVERSION DE String A Double:

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI: " + valorPI);
        System.out.println("El tipo de valorPI: " + ((Object) valorPI).getClass().getSimpleName()); // Double

        // Pedir un valor (Scanner)
        var consola = new Scanner(System.in);

        // Preguntar su nombre
        System.out.println("Como te llamas?");
        var nombre = consola.nextLine();

        // Preguntar su edad
        System.out.println("Que edad tienes?");
        var edadUsuario = Integer.parseInt(consola.nextLine());

        // Enviar una respuesta al usuario con sus datos
        System.out.println("La edad del usuario: " + nombre + ", es de: " + edadUsuario);

        // Mirar sus tipos de datos:
        System.out.println("Tipo de dato nombre: " + nombre.getClass().getSimpleName());
        System.out.println("Tipo de dato edadUsuario: " + ((Object) edadUsuario).getClass().getSimpleName());

        // DE TIPO Int A String

        // valueOf es para convertir de int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto: " + edadTexto);
        System.out.println("Tipo de dato edadTexto: " + ((Object) edadTexto).getClass().getSimpleName());

        // Para solicitar solamente un caracter de un String, podemos hacer uso de
        // charAt(int index)
        var caracter = "hola".charAt(0); // h
        System.out.println("caracter es de tipo: " + ((Object) caracter).getClass().getSimpleName());

        // Programa para obtener un caracter de una cadena string enviado por el usuario
        System.out.println("Escriba la frase del dia, y le responderé con el caracter adecuado: ");
        var respuestaUsuario = consola.nextLine().charAt(0); // Solo obtenemos el indice que queremos, aunque envie más
                                                             // de 1 caracter
        System.out.println("El caracter de tu frase del dia es: " + respuestaUsuario);
        System.out.println("respuestaUsuario es de tipo: " + ((Object) respuestaUsuario).getClass().getSimpleName());

    }
}
