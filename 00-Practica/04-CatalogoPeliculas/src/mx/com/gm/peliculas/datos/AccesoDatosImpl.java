package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso); //<-- Solamente estamos creando la variable de archivo, no estamos creando el archivo fisico en el disco duro.
        return archivo.exists(); //retornamos un true si existe el archivo y un false si no.
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso); // Definimos la variable archivo de tipo File
        List<Pelicula> peliculas = new ArrayList(); // Creamos una variable que contendrá una lista de nombres de peliculas.
        try {
            //bufferedreader lo utilizamos para leer lineas completas del archivo y nos apollamos de FileReader para leer el archivo.
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null; //Creamos una variable tipo String para almacenar cada una de las lineas.
            linea = entrada.readLine(); //y para agregar las lineas de nuestro archivo, utilizamos el metodo readLine para leerla.
            while (linea != null) {
                //Creamos un objeto de tipo pelicula pasandole la linea que estamos obteniendo
                Pelicula pelicula = new Pelicula(linea); //<-- de esta manera obtenemos el objeto de tipo pelicula
                //y ahora la agregamos a nuestra lista:
                peliculas.add(pelicula);
                linea = entrada.readLine(); //y volvemos a leer otra linea para ver si hay más lineas o no.
            }
            //Una vez termine de leer todas las lineas del archivo, cerramos el archivo y lo guardamos.
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            //propagamos la excepcion
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            //propagamos la excepcion
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }
        return peliculas; //retornamos el listado de peliculas
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        //Creamos la instancia a la clase File con el path indicado que contiene nombreRecurso
        var archivo = new File(nombreRecurso);
        try {
            //Creamos un objeto de tipo PrintWriter para agregar el texto que queramos y creamos dentro de sus parentesis
            //otro objeto de tipo FileWriter para agregar el texto dentro del archivo que indiquemos en sus parentesis
            //indicamos el objeto archivo y el argumento anexar para verificar si queremos agregar el texto despúes de otro o no.
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            //Ahora vamos a imprimir una nueva linea con println y dentro de sus parentesis le enviamos el objeto pelicula. y le enviamos el metodo toString() para que se imprima.
            salida.println(pelicula.toString());
            salida.close(); //cerramos el flujo
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir la pelicula: " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            //BufferedReader se utiliza para leer lineas completas del archivo especificado en sus parentesis, creamos un nuevo objeto
            //llamado FileReader que es para leer el archivo especificado en sus parentesis(cabe recordar que FileReader no lee lineas completas)
            //por eso utilizamos BufferedReader para leerlas.
            var entrada = new BufferedReader(new FileReader(archivo));
            //Creamos una variable llamada linea para almacenar cada linea del archivo especificado anteriormente
            String linea = null;
            //y le agregamos cada una de las lineas que contiene entrada y con el metodo readLine() pasamos la informacion a la variable linea.
            linea = entrada.readLine();
            //Debemos saber el indice que estamos leyendo, para eso utilizamos una variable de tipo int para saber su indice:
            int indice = 1;
            while(linea != null){
                //podemos utilizar equalsIgnoreCase para ignorar las mayusculas y minusculas que contiene el string
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }
                //Si no se encontró anteriormente en la primer linea, leemos la siguiente
                linea = entrada.readLine();
                //y sumamos uno al indice para saber en todo momento su indice.
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            //propagamos la excepcion
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            //propagamos la excepcion
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
             ex.printStackTrace();
            //propagamos la excepcion
            throw new AccesoDatosEx("Excepcion al crear el archivo: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if(archivo.exists()){
        archivo.delete();
            System.out.println("Se ha borrado el archivo");
    }
    }

}
