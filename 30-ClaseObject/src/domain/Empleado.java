
package domain;

import java.util.Objects;


public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    //En el lenguaje de programación Java un HashCode es un identificador de 32 bits que se almacena en un Hash en la instancia de la clase.
    //Toda clase debe proveer de un método hashCode() que permite recuperar el Hash Code asignado, por defecto, por la clase Object. 
    @Override
    public int hashCode(){ //<-- Genera un hash lo más único posible
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;    
    }
    
    //El metodo equals se encargará de ver si los atributos de esta clase son iguales en contenido, haciendo unas cuantas condiciones    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        //downcast
        final Empleado other = (Empleado) obj;
        if(Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)){
            return false;
        }
        if(!Objects.equals(this.nombre, other.nombre)){
            return false;
        }
       return true; //<-- Si llega hasta aqui quiere decir que los dos objetos son iguales
    }
    
    
}
