package com.registro.datos;

import com.registro.domain.CheckUsuario;
import com.registro.excepciones.*;
import java.util.List;

public interface IntAccesoDatos {

    boolean existe(String nombreUsuario) throws AccesoDatosEx;
    
    List<CheckUsuario> listar(String nombreUsuario) throws LecturaDatosEx;
    
    void escribir(CheckUsuario usuario,String nombreUsuario, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreUsuario, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreUsuario) throws AccesoDatosEx;
    
    void borrar(String nombreUsuario) throws AccesoDatosEx;
    

}
