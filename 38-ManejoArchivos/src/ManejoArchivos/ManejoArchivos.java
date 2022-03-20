package ManejoArchivos;

import java.io.*;

/*
En esta clase vamos a manejar varios metodos ya que el manejo de archivos implica varias operaciones, desde crear el archivo, guardar informacion en el archivo, eliminar informacion
y eliminar el archivo por completo, entre otras operaciones más que podemos hacer cuando estamos trabajando con archivos.
 */
public class ManejoArchivos {

    //Los metodos que vamos a agregar en esta clase son estaticos, para que no tengamos la necesidad de crear un objeto de esta clase y poder utilizar estos metodos directamente.
    public static void CrearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo); //<-- esto crea la instancia a la composicion del archivo
        try {
            PrintWriter salida = new PrintWriter(archivo); //<-- Esto abre el archivo
            salida.close(); //y esto cierra el archivo y se crea en el disco duro
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) { //FileNotFoundException se hereda de Exception, por ende es de tipo check exception
            e.printStackTrace(System.out);
        }
    }

    //Este metodo recibe dos parametros, el primero es para saber la ruta en el que vamos a escribir el archivo y el segundo parametro es para recibir lo que hay que escribir.
    public static void EscribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo); //<-- Esto crea el archivo y la instancia al mismo
        try {
            PrintWriter salida = new PrintWriter(archivo); //<-- abre el archivo.
            salida.println(contenido); //println recibe la informacion que queremos añadir a nuestro archivo
            salida.close(); //esto guarda la informacion y cierra el archivo.
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException e) { //FileNotFoundException se hereda de Exception, por ende es de tipo check exception
            e.printStackTrace(System.out);
        }
    }

    //Este metodo es para anexar la informacion que queremos añadir a nuestra archivo una vez creado y escrito.
    public static void AnexarArchivo(String nombreArchivo, String contenidoAnexado) {
        File archivo = new File(nombreArchivo); //<-- Esto crea el archivo y la instancia al mismo
        try {
            //dentro de la clase PrintWriter creamos una nueva instancia hace FileWriter indicando que queremos escribir más informacion en el archivo, indicando true para permitirlo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); //<-- (Esto abre el archivo y nos indica si queremos permitir o no que se añada informacion al archivo).
            salida.println(contenidoAnexado); //println recibe la informacion que queremos añadir a nuestro archivo
            salida.close(); //esto guarda la informacion y cierra el archivo.
            System.out.println("Se ha escrito nueva informacion al archivo");
        } catch (FileNotFoundException e) { //FileNotFoundException se hereda de Exception, por ende es de tipo check exception
            e.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }
    }

    public static void LeerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            //Variable de tipo BufferedReader, con esta clase lo que vamos a hacer es leer informacion de un archivo, quiere decir que podemos leer lineas completas
            //del archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Creamos de nuevo la instancia a FileReader para poder abrir y leer el archivo
            String lectura = entrada.readLine(); //Esto lee la primera linea creada.
            //Si tenemos más lineas como en este caso, tenemos que utilizar el ciclo while.
            //Mientras esta variable sea diferente de null, se ejecutará todas las lineas del archivo utilizando la siguiente sintaxis:
            while(lectura != null){
                //Imprimimos la linea que queremos leer
                System.out.println("Lectura = " + lectura);
                //Y añadimos a la variable lectura la siguiente linea creada que queremos leer
                lectura = entrada.readLine();
            }
            entrada.close(); //cerramos el archivo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
