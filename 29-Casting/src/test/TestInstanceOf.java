package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        determinarTipoConIf(empleado);
        Gerente gerente1 = new Gerente("Karla", 10000, "Sistemas");
        determinarTipo(gerente1);
        determinarTipoConIf(gerente1);

    }

    public static void determinarTipo(Empleado empleado) {
        System.out.println("determinarTipo: " +  empleado.getNombre());

        if (empleado instanceof Gerente) {

            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
        System.out.println("");

    }

    public static void determinarTipoConIf(Empleado empleado) {
        System.out.println("determinarTipoConIf: " + empleado.getNombre());
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        }
        if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        }
        if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
        System.out.println("");

    }
}
