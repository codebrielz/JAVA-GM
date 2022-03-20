package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

/*
En la interface definimos el comportamiento que tendrá nuestra implementación AccesoDatosImpl
*/
public interface IAccesoDatos {

    //Metodo que retorna un boolean recibe el nombre del recurso y en caso de dar error, se pasa el mensaje al archivo AccesoDatosEx para manejar el error.
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    //Metodo que retorna un List recibe el nombre del recurso y en caso de dar error, se pasa el mensaje al archivo LecturaDatosEx para manejar el error.
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    //Metodo que no retorna nada recibe el objeto Pelicula, el nombre del recurso y un boolean para indicar si se sobreescribe o no el archivo indicado,
    //y en caso de dar error, se pasa el mensaje al archivo EscrituraDatosEx para manejar el error.
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    //Metodo que retorna String y recibe dos Strings, en caso de error, se envia al archivo LecturaDatosEx
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    //Metodo que no retorna nada, recibe un String y en caso de error se envia a AccesoDatosEx
    void crear(String nombreRecurso) throws AccesoDatosEx;

    //Metodo que no retorna nada, recibe un String y en caso de error se envia a AccesoDatosEx
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
