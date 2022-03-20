/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static ManejoArchivos.ManejoArchivos.*;

/**
 *
 * @author codeb
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
        var nombreArchivo1 = "Prueba1.txt";
//        CrearArchivo(nombreArchivo); //Los metodos staticos se pueden llamar directamente sin necesidad de crear un objeto de la clase.
//        EscribirArchivo(nombreArchivo,"Hola Mundo"); //Se ha escrito el archivo.
//        AnexarArchivo(nombreArchivo,"Adios");
//        AnexarArchivo(nombreArchivo,"Que tal?");
//        AnexarArchivo(nombreArchivo,"Bien");        
        LeerArchivo(nombreArchivo);
    }

}