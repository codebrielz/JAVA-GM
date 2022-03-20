
package com.rolls;

public class Tienda {
    private final int idCliente;
    protected Pantalones pantalon;
    protected Camisa camisa;
    private static int contadorClientes;
    
    public Tienda(){
    this.idCliente = ++Tienda.contadorClientes;
    }
    
    public Tienda(Pantalones pantalon, Camisa camisa){
        this();
        this.pantalon = pantalon;
        this.camisa = camisa;
    }

    public Pantalones getPantalon() {
        return pantalon;
    }

    public void setPantalon(Pantalones pantalon) {
        this.pantalon = pantalon;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    public static void setContadorClientes(int contadorClientes) {
        Tienda.contadorClientes = contadorClientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tienda{");
        sb.append("idCliente=").append(idCliente).append(", ");
        sb.append("Camisa=").append(this.camisa).append(", ");
        sb.append("Pantalon=").append(this.pantalon);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
