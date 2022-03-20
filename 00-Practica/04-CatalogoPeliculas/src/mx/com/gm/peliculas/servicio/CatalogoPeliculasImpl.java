package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    //Creamos un atributo de tipo IAccesoDatos para que solamente maneje las clases con esa interface.
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        //Creamos la instancia de nuestro atributo de tipo IAccesoDatos a la clase AccesoDatosImpl() <-- que a su vez tambien trabaja con la misma interface.
        this.datos = new AccesoDatosImpl();
    }

    //Sobreescribimos todos los metodos indicados en la interface ICatalogoPeliculas
    @Override
    public void agregarPelicula(String nombrePelicula) {
        //Convertimos el argumento de tipo String a un objeto de tipo pelicula.
        Pelicula pelicula = new Pelicula(nombrePelicula);
        //Por defecto anexar estará en false.
        boolean anexar = false;
        try {
            //Agregamos true o false a anexar si existe el archivo. (utilizamos el atributo datos que contiene los metodos de la clase AccesoDatosImpl)
            //que contiene el metodo existe y en sus parentesis tenemos que indicar el archivo correspondiente (el atributo NOMBRE_RECURSO se encuentra en
            //la interface ICatalogoPeliculas).
            anexar = datos.existe(NOMBRE_RECURSO);
            //Si es true la parte anterior, utilizamos el metodo escribir de la clase AccesoDatosImpl mandandole la pelicula, el archivo al que queremos escribir
            //y true (ya que existe el archivo (de lo contrario crea un nuevo archivo (en caso de false))).
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            //creamos una variable que contendrá el listado que le pasemos al metodo listar encargado de listar.
            var peliculas = datos.listar(NOMBRE_RECURSO);
            //iteramos las peliculas
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

}
