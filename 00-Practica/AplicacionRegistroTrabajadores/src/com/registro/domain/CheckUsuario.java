package com.registro.domain;

public class CheckUsuario {
    
    private String nombreUsuario;
    
    public CheckUsuario(){
        
    }
    public CheckUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getNombreUsuario(){
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreUsuario);
        return sb.toString();
    }
    
    
}
