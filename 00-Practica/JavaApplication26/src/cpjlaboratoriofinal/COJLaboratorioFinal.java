package cpjlaboratoriofinal;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;

public class COJLaboratorioFinal {
    public static void main(String[] args) {
        AccesoDatos dato = (AccesoDatos) new Pelicula();
        AccesoDatos dato1 = (AccesoDatos) new Pelicula();
        dato.setNombre("Spiderman");
        dato.setNombreArchivo("Archivo1.txt");
    }
}
