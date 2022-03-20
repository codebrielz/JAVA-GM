package com.rolls;

public class Camisa {

    private final int idCamisa;
    protected String marca;
    protected int talla;
    private static int contadorCamisa;

    public Camisa() {
        this.idCamisa = ++Camisa.contadorCamisa;
    }

    public Camisa(String marca, int talla) {
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
        sb.append("Camisa{");
        sb.append("idCamisa=").append(idCamisa);
        sb.append(", marca=").append(marca);
        sb.append(", talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

}
