
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        // Podemos acceder a los atributos de Persona desde la clase hija Empleado.
        Empleado empleado1 = new Empleado("Cristiano", 100.000);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente(new Date(), false,"Gala",'F',23,"Su");        
        Cliente cliente2 = new Cliente(new Date(), true,"Angy",'F',28,"Su");
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
    }
}
