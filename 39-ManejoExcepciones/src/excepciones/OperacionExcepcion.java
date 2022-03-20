package excepciones;

/*
Para que JAVA comprenda que esto es una clase de excepcion, tenemos que extender de una clase de la API de JAVA
*/
//Exception es de tipo CheckException, eso quiere decir que se verá el error en tiempo de ejecución y no de compilación
/*
A dia de hoy es más recomendado utilizar RuntimeException (unCheck exception) que Exception(check exception) ya que deja el codigo más limpio.
*/
public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion(String mensaje){ //<-- Recibimos el mensaje de excepcion
        super(mensaje); //<-- Pasamos el mensaje de la excepcion a la clase padre.
    }
}
