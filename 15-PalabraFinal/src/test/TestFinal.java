package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        
        //final: una vez asginado el valor de la variable con la palabra final, es imposible volver a asignar otro valor.
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        // miVariable = 20; <-- NO SE PUEDE cambiar el valor
        
        //Llamada al atributo constante de mi clase Persona
        //Persona.VALOR_CONSTANTE = "NO SE MODIFICA";
        System.out.println("Persona.VALOR_CONSTANTE = " + Persona.VALOR_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //NO SE PUEDE CREAR UNA NUEVA REFERENCIA A persona1 YA QUE ESTA VARIABLE SE MARCÓ COMO FINAL.
        //persona1 = new Persona();
        
        //PERO SI A TRAVES DE LA variable persona1, podemos modificar los valores de los atributos del objeto al cual estamos apuntando
        //NO PODEMOS MODIFICAR EL VALOR DE LA VARIABLE, pero SI PODEMOS MODIFICAR EL CONTENIDO DEL OBJETO AL CUAL ESTÁ APUNTANDO.
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());

    }
    
}
