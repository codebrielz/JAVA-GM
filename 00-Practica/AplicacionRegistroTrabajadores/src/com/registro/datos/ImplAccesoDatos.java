package com.registro.datos;

import com.registro.domain.CheckUsuario;
import com.registro.excepciones.AccesoDatosEx;
import com.registro.excepciones.EscrituraDatosEx;
import com.registro.excepciones.LecturaDatosEx;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class ImplAccesoDatos implements IntAccesoDatos {

    @Override
    public boolean existe(String nombreUsuario) throws AccesoDatosEx {
        File archivo = new File(nombreUsuario);
        return archivo.exists();
    }

    @Override
    public List<CheckUsuario> listar(String nombreUsuario) throws LecturaDatosEx {
        File archivo = new File(nombreUsuario);
        List<CheckUsuario> listaUsuarios = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreUsuario));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                CheckUsuario usuario = new CheckUsuario(linea);
                listaUsuarios.add(usuario);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return listaUsuarios;
    }

    @Override
    public void escribir(CheckUsuario usuario, String nombreUsuario, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreUsuario);
        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.println(usuario);
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(ImplAccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String buscar(String nombreUsuario, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreUsuario);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = -1;
            while(indice != 0){
                if(buscar!=null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Usuario " + linea + " Se ha encontrado en el indice " + indice;
                    break;
                }
                linea = entrada.readLine(); 
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplAccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplAccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }

    @Override
    public void crear(String nombreUsuario) throws AccesoDatosEx {
        File archivo = new File(nombreUsuario);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(ImplAccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(String nombreUsuario) throws AccesoDatosEx {
        File archivo = new File(nombreUsuario);
        if(archivo.exists()){
            archivo.delete();
        }else{
            System.out.println("Este archivo ya ha sido eliminado");
        }
    }

}
