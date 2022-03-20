/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author codeb
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        //Podemos crear una variable de tipo padre y almacenar en su variable clases hijas
        Empleado empleado;        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        //Podemos acceder a los metodos de la clase padre y obtenemos tambien la informacion de la clase hija, esto se debe al polimorfismo
        System.out.println(empleado.obtenerDetalles());
        
        //NO PODEMOS ACCEDER A LOS METODOS DE LA CLASE HIJA DIRECTAMENTE, YA QUE NO MANTIENEN UNA RELACION COMO EN EL CASO 
        //DE obtenerDetalles que está sobreescrito en la clase hija
//        empleado.getTipoEscritura();

        //Para poder llamar al metodo de la clase hija, tenemos que hacer una conversion, a esto se le conoce como Downcasting
//        ((Escritor) empleado).getTipoEscritura();

        //o tambien:
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Pero si queremos asignar una variable de tipo hija al tipo padre tenemos que hacer un Upcasting
        //No es necesario hacer una conversion explicita, como la del padre al hijo.
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
    }
}
