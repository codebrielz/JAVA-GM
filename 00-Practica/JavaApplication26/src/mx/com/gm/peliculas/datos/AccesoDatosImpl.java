package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;

public interface AccesoDatosImpl {

    boolean existe(String nombreArchivo);
    List listar(String nombre);
    void escribir(Pelicula pelicula, String nombreArchivo, boolean Anexar);
    String buscar(String nombreArchivo, String buscar);
    void crear(String nombreArchivo);
    void borrar(String nombreArchivo);
    
    
}
