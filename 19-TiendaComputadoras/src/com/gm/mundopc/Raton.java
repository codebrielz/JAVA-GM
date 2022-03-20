
package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    public int idRaton;
    public static int contadorRatones;

    public Raton(String marca, String tipoEntrada) {
        super(tipoEntrada, marca);
        this.marca = marca;
        this.tipoEntrada = tipoEntrada;
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append(", ");
        sb.append(", ").append(super.toString());
        return sb.toString();
    }

}
