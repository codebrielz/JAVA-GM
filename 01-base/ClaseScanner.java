import java.util.Scanner; //Importacion de Scanner

public class ClaseScanner {
    public static void main(String[] args) {

        System.out.println("Escribe tu nombre: ");
        // Scanner captura la informacion que escriba el usuario, tenemos que crear una
        // nueva instancia para capturar su informacion, tambien hay que importarlo:
        // Se puede utilizar la variable consola tantas veces como necesitemos (es
        // reutilizable)
        // Es reutilizable ya que cada vez que utilicemos consola.(metodo) estamos
        // creando una nueva instancia con la variable que relacionamos
        Scanner consola = new Scanner(System.in); // in: input (entrada)
        var usuario = consola.nextLine(); // nextLine (siguiente linea (es para leer una linea de la consola), el
                                          // programa se detiene hasta que el usuario escriba alguna informacion)
        System.out.println("El nombre del usuario es: " + usuario);
        System.out.println("Ahora escribe un titulo: ");
        var titulo = consola.nextLine();
        System.out.println("El titulo que escribio el usuario: " + usuario + " es: " + titulo);
    }
}
