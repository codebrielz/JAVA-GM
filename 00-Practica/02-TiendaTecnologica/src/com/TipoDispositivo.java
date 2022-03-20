
package com;

public class TipoDispositivo {

    private final int idTipoDispositivo;
    private String marca;
    private String salida;
    private static int contadorTipoDispositivo;
    
    public TipoDispositivo(String marca, String salida){
        this.marca = marca;
        this.salida = salida;
        this.idTipoDispositivo = ++TipoDispositivo.contadorTipoDispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TipoDispositivo{");
        sb.append("idTipoDispositivo=").append(idTipoDispositivo);
        sb.append(", marca=").append(marca);
        sb.append(", salida=").append(salida);
        sb.append('}');
        return sb.toString();
    }
    
    
}
