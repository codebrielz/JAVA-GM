
package com.gm.mundopc;

public class Monitor {
    public int idMonitor;
    public String marca;
    public double tamanio;
    public static int contadorMonitores;
    
    public Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
     public int getIdMonitor(){
        return this.idMonitor;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id monitor: ").append(this.idMonitor).append(", ");
        sb.append("Marca: ").append(marca).append(", ");
        sb.append("Tamanio: ").append(tamanio);
        return sb.toString();
    }
    
}
