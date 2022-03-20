
package test;

import domain.PersonaBean;


public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        
        persona.setNombre("Gabriel");
        persona.setApellido("Valentin");
        
        System.out.println("persona = " + persona);
    
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Apellido = " + persona.getApellido());
    }
}
