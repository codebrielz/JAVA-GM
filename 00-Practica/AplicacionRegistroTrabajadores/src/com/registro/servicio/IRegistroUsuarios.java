package com.registro.servicio;

public interface IRegistroUsuarios {
    String NOMBRE_RECURSO = "registro.txt";
    
    void agregarUsuario(String nombreUsuario);
    
    void listarUsuario();
    
    void buscarUsuario(String buscar);
    
    void iniciarRegistroUsuarios();
}
