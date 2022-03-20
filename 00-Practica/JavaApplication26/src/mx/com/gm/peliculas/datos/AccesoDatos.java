package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatos implements AccesoDatosImpl{
   
    @Override
    public boolean existe(String nombreArchivo){
        if(nombreArchivo != null){
            System.out.println("El archivo que buscas si existe.");
            return true;
        }else{
            System.out.println("El archivo que buscas NO existe");
            return false;
        }
    }
    @Override
    public List<Pelicula> listar(String nombre){
     List miLista = new ArrayList();
     miLista.add(nombre);
     return miLista;
    }
    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar){
        File file = new File(nombreArchivo);
        try {
            //llamamos a la clase PrintWriter para crear una instancia de la misma 
            //y en sus parentesis, creamos una instancia de FileWriter para permitir escribir en el archivo creado.
            PrintWriter salida = new PrintWriter( new FileWriter(file), true );
            //con println agregamos la linea de texto que queremos añadir en el archivo.
            salida.println(pelicula);
            //con close, cerramos y guardamos la informacion en el archivo.
            salida.close();
            System.out.println("Se ha escrito nueva informacion al archivo");
        } catch (FileNotFoundException e) { //FileNotFoundException se hereda de Exception, por ende es de tipo check exception
            e.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }
    }
    @Override
    public String buscar(String nombreArchivo, String buscar){
        if(nombreArchivo.equals(buscar)){
        return "Se ha encontrado el archivo: " + nombreArchivo;            
        }else{
            return "NO se ha encontrado ningún archivo llamado" + nombreArchivo;
        }
    }
    @Override
    public void crear(String nombreArchivo){
        File file = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(file);
            salida.close();
            System.out.println("Archivo creado");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    @Override
    public void borrar(String nombreArchivo){
        File file = new File(nombreArchivo);
        file.delete();
        System.out.println("Se ha borrado el archivo");
    }
    
    
}
