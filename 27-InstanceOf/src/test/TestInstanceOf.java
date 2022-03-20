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
        //Pregunta si empleado es una instancia de la clase Gerente
        //El orden suele ser de las subClases hasta el padre (incluso a veces llegando a Object)
        if (empleado instanceof Gerente) {
            /*
            Uno de los detalles extras donde podemos utilizar instanceof es para convertir un tipo de dato una vez que ya hayamos identificado su tipo, entonces podemos convertir
            la variable de tipo padre a una variable de tipo hijo, y esto basicamente lo podemos hacer para volver a tener acceso a los atributos o metodos de la clase hija.
            */
            /*
            Entonces primero debemos convertir el dato que nos proporcionan al tipo que queremos obtener su metodo, en este caso a la clase Gerente, existen dos formas para convertir
            un tipo Padre a un tipo Hijo
            */
            //Con los parentesis indicamos que queremos convertir la variable empleado de tipo Empleado a tipo Gerente.
            //Instanceof nos sirve para asegurarnos de que podemos hacer este tipo de conversiones
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("Es de tipo gerente");
            //Este codigo lo que hace es convertir primero empleado en tipo Gerente y despues utilizar su metodo indicado.
            //Asi que directamente no tenemos acceso al getDepartamento
//            ((Gerente) empleado).getDepartamento();
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
        System.out.println("");

    }

    public static void determinarTipoConIf(Empleado empleado) {
        System.out.println("determinarTipoConIf: " + empleado.getNombre());
        //Si solamente ponemos if, vamos a hacer preguntas multiples y obtendremos respuestas multiples a diferencia de if/else if, que al realizar 1 true ya para la ejecucion
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
