package com.registro.servicio;

import com.registro.datos.*;
import com.registro.domain.CheckUsuario;
import com.registro.excepciones.AccesoDatosEx;
import com.registro.excepciones.LecturaDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroUsuariosImpl implements IRegistroUsuarios {

    private final IntAccesoDatos datos;
    
    public RegistroUsuariosImpl(){
        this.datos = new ImplAccesoDatos();
    }
    
    @Override
    public void agregarUsuario(String nombreUsuario) {
        CheckUsuario usuario = new CheckUsuario();
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(usuario, nombreUsuario, anexar);
        } catch (AccesoDatosEx ex) {
            Logger.getLogger(RegistroUsuariosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listarUsuario() {
        try {
            var usuarios = datos.listar(NOMBRE_RECURSO);
            for(var usuario: usuarios){
                System.out.println("usuario = " + usuario);
            }
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(RegistroUsuariosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buscarUsuario(String buscar) {
        String resultado = null;
        resultado = 
    }

    @Override
    public void iniciarRegistroUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
