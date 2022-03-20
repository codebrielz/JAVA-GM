
package com;


public class Raton extends TipoDispositivo {
    private final int idRaton;
    private static int contadorRaton;
    
     public Raton(String marca, String salida){
        super(marca,salida);
        this.idRaton = ++Raton.contadorRaton;
    }

}
