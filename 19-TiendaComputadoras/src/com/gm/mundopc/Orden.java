
package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes; 
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora; //Por cada computadora agregada, se asigna un nuevo renglon con ese valor
        }else{
            System.out.println("Se ha superado el limite de pedidos de computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("idOrden= ").append(idOrden);
        sb.append(", computadoras= ").append(computadoras);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
