
package com;

public class Orden {
    private final int idOrden;
    private Ordenador ordenador[];
    private int contadorOrdenador;
    private static int contadorOrden;
    private static final int MAX_ORDENADORES = 10;
    
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.ordenador = new Ordenador[MAX_ORDENADORES];
    }

    public void agregarOrdenador(Ordenador ordenador){
        if(contadorOrdenador < MAX_ORDENADORES){
            this.ordenador[contadorOrdenador++] = ordenador;
        }else{
            System.out.println("Se ha superado el limite de ordenadores que pedir");
        }
    }
    
    public void mostrarOrden(){
        for (int i = 0; i < this.contadorOrdenador; i++) {
                System.out.println("Ordenador " + i + ": " + this.ordenador[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", ordenador=").append(ordenador);
        sb.append(", contadorOrdenador=").append(contadorOrdenador);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
