
package test;

import domain.*;



public class TestClaseObject {
    public static void main(String[] args) {
        
        //Recordemos que los objetos almacenan referencias en memoria.
        //Con la palabra new estamos indicando que queremos crear una nueva referencia de memoria al objeto Empleado
        Empleado empleado1 = new Empleado("Juan",5000);
        Empleado empleado2 = new Empleado("Juan",5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("No tienen la misma referencia en memoria"); //<--- Se ejecuta esta
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido"); //<-- Se ejecuta este
        }else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hashcode de empleado1 es: " + empleado1.hashCode() + ", y el hashcode del empleado2 es: " + empleado2.hashCode() + ", por ende, son iguales" ); //<-- se ejecuta este, ya que los valores del objetos son iguales, el hashcode tambien debe serlo
        }else{
            System.out.println("el valor hashcode es distinto");
        }
        
        
        
    }
}
