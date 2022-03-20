package mx.com.gm.peliculas.excepciones;

/*
La clase padre que recibe las excepciones de los hijos, tiene que especificarse a que tipo de excepciones quiere realizarse en la aplicacion, si de UnCheck (RunTimeException) o
check (Exception).
*/

public class AccesoDatosEx extends Exception{
    //Constructor que recibe un String
    public AccesoDatosEx(String message){
        //Pasamos el argumento a la clase padre.
        super(message);
    }
}
