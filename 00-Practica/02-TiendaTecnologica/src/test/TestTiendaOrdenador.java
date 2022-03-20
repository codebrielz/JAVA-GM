/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.*;

/**
 *
 * @author codeb
 */
public class TestTiendaOrdenador {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Razer","Cable");
        Raton raton = new Raton("Razer","Cable");
        Monitor monitor = new Monitor();
        monitor.setMarca("AOC");
        Ordenador ordenador = new Ordenador(teclado, raton, monitor);
        Orden orden1 = new Orden();
        orden1.agregarOrdenador(ordenador);
        orden1.mostrarOrden();
    }
}
