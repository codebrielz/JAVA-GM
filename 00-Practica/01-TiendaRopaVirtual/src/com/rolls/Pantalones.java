package com.rolls;

public class Pantalones {

    private final int idPantalones;
    protected String marca;
    protected int talla;
    private static int contadorPantalones;

    public Pantalones() {
        this.idPantalones = ++Pantalones.contadorPantalones;
    }

    public Pantalones(String marca, int talla) {
        this();
        this.marca = marca;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalones{");
        sb.append("idPantalones=").append(idPantalones);
        sb.append(", marca=").append(marca);
        sb.append(", talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

}
