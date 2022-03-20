package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        /*
        Vamos a empezar creando un tipo de la interface list,
        una lista es similar a un array, podemos asignar varios elementos a nuestra lista, sin embargo una de las ventajas
        de utilizar un tipo List es que puede crecer dinamicamente, no es necesario indicar la cantidad de elementos con el que vamos a iniciar.
         */
        List miLista = new ArrayList(); //lista de tipo List creando una instancia a la clase ArrayList
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo"); //La diferencia es que en el tipo List, podemos duplicar los valores sin problema
        miLista.add("Domingo");
        //foreach:
//        System.out.println("Ciclo foreach");
//
//        for (Object elemento: miLista) {
//            System.out.println("elemento: " + elemento);
//        }

        //funcion lambda o funcion flecha
        System.out.println("Funcion lambda");
        System.out.println("");
        System.out.println("Interface List");
        System.out.println("----------------");

        imprimir(miLista);

        /*La interface set no respeta el orden*/
        Set miSet = new HashSet(); //La clase HashSet implementa a la interface Set, La clase HashSet no asegura respetar el orden en el que se van implementando los elementos.
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo"); //En cambio en el tipo Set, no se pueden duplicar los valores, si ve que se duplica un elemento, elimina el elemento duplicado. (Deja 1 de los dos)
        miSet.add("Domingo");

        System.out.println("");
        System.out.println("Interface Set");
        System.out.println("----------------");

        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Llave1", "Valor asociado a Llave1");
        miMapa.put("Llave2", "Valor asociado a Llave2");
        miMapa.put("Llave3", "Valor asociado a Llave3");
        
         System.out.println("");
        System.out.println("Interface Map");
        System.out.println("----------------");
        //Acceder a los elementos del Map:
        //Ya que queremos pasarlo a una variable tipo String y nuestra llave es de tipo Object, es un downcast, entonces tenemos que castearlo más especificamente.
        String elemento = (String) miMapa.get("Llave1");
        System.out.println("elemento: " + elemento);
        
        //Y para recuperar todas las llaves:
        imprimir(miMapa.keySet()); //Nos regresará todas las llaves, pero no los valores de las llaves. Debido a que keySet es de tipo Set, no se garantiza un orden
        imprimir(miMapa.values()); //values imprime SOLAMENTE los valores de cada llave.
    }

    //Nuestro metodo es para realizar el polimorfismo, es decir, ahorrar repetir un codigo varias veces.
    //Nuestro metodo recibira el tipo MÁS generico, es decir, el padre de List y Set
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento: " + elemento);
        });
    }
    
    /*basicamente un map es una coleccion de elementos pero almacenado en el concepto de llave/valor, asi que por cada llave que agreguemos, le asociaremos un valor*/
}
