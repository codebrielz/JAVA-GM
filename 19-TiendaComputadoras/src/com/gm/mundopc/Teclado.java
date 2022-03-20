
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclado;
    public Teclado(String marca, String tipoEntrada) {
        super(tipoEntrada, marca);
        this.marca = marca;
        this.tipoEntrada = tipoEntrada;
        this.idTeclado = ++Teclado.contadorTeclado;
        
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append(", ");
         sb.append(", ").append(super.toString());
        return sb.toString();
    }
}
