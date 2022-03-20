package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        Scanner consola = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo de peliculas \n"
                    + "2. Agregar peliculas\n"
                    + "3. Listar peliculas\n"
                    + "4. Buscar pelicula\n"
                    + "0. Salir");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce de la pelicula: ");
                    var nombrePelicula = consola.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula: ");
                    nombrePelicula = consola.nextLine();
                    catalogo.buscarPeliculas(nombrePelicula);
                    break;
                case 0:
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

}
