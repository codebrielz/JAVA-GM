
package com;

public class Teclado extends TipoDispositivo {
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String marca, String salida){
        super(marca,salida);
        this.idTeclado = ++ Teclado.contadorTeclado;
    }
}
