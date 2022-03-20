package mx.com.gm.peliculas.domain;

public class Pelicula {

    //Atributo
    private String nombre;

    //Constructor vacio
    public Pelicula() {
    }
    
    //Constructor que recibe un argumento de tipo String
    public Pelicula(String nombre) {
        //Pasamos el argumento recibido al atributo de la clase
        this.nombre = nombre;
    }

    //Metodo para obtener el atributo de la clase.
    public String getNombre() {
        return this.nombre;
    }

    //Metodo para modificar el atributo de la clase.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Sobreescribimos el metodo que retorna un String, este metodo es para enviar un mensaje general de esta clase.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        return sb.toString();
    }
    
    
}
