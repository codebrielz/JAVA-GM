package com;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private static int contadorMonitor;

    //Bloque de inicializacion NO ESTATICO
    {
        this.idMonitor = ++contadorMonitor;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
