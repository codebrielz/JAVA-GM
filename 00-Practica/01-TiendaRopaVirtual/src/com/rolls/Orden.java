
package com.rolls;

public class Orden {
    private int idOrden;
    private Tienda tienda[];
    private int contadorClientes;
    private static int contadorOrden;
    private final static int MAX_ROPA = 10;
    
    public Orden(){
        this.tienda = new Tienda[MAX_ROPA];
        this.idOrden = ++Orden.contadorOrden;
    }
    
    public void agregarRopa(Tienda tienda){
        if(this.contadorClientes < MAX_ROPA){
            this.tienda[contadorClientes++] = tienda;
        }else{
            System.out.println("Has superado el limite de compra");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Su tique de compra: ");
        for (int i = 0; i < contadorClientes; i++) {
            System.out.println(tienda[i]);
        }
    }
    
}
