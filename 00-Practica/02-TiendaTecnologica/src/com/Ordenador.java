package com;

public class Ordenador {
    private final int idOrdenador;
    private Teclado teclado;
    private Raton raton;
    private Monitor monitor;
    private static int contadorOrdenador;
    
    {
        this.idOrdenador = ++Ordenador.contadorOrdenador;
    }
    
    public Ordenador(Teclado teclado, Raton raton, Monitor monitor){
        this.teclado = teclado;
        this.raton = raton;
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordenador{");
        sb.append("idOrdenador=").append(idOrdenador);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append(", monitor=").append(monitor);
        sb.append('}');
        return sb.toString();
    }
    
    

}
