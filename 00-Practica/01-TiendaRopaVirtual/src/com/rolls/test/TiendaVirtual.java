
package com.rolls.test;

import com.rolls.*;

public class TiendaVirtual {
    public static void main(String[] args) {
        Pantalones pantalones = new Pantalones("Luois", 38);
        Camisa camisa = new Camisa("Nike", 40);
        Tienda tienda = new Tienda(pantalones, camisa);
        
        Pantalones pantalones1 = new Pantalones("Luois", 38);
        Camisa camisa1 = new Camisa("Nike", 40);
        Tienda tienda1 = new Tienda(pantalones, camisa);
        
        Orden orden1 = new Orden();
        orden1.agregarRopa(tienda);
        orden1.agregarRopa(tienda1);
        orden1.mostrarOrden();
    }
}
