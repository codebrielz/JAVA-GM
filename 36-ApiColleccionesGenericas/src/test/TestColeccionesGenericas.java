package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        /*
        Toda la api de Collections soporta tipos genericos, asi que vamos a utilizar la siguiente sintaxis
        */
        List<String> miLista = new ArrayList<>(); //<--Sintaxis que utilizamos para indicar el tipo generico a List. por defecto el tipo es Object
        miLista.add("Lunes"); //Ahora si miramos add, indica que recibe valores de tipo String.
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo"); 
        miLista.add("Domingo");
        //Gracias a que hemos definido el tipo de la List, ahora no hace falta hacer la conversion del tipo Object al tipo que deseemos.
//        String valor = miLista.get(0);
//        System.out.println("valor = " + valor);
        //Y ahora para imprimir nuestra lista con interface List que hemos especificado el tipo String, tenemos que hacer lo siguiente en nuestro metodo imprimir():
//        imprimir(miLista);
        
        //funcion lambda o funcion flecha
        System.out.println("Funcion lambda");
        System.out.println("");
        System.out.println("Interface List");
        System.out.println("----------------");

        imprimir(miLista);

        /*La interface set no respeta el orden*/
        Set<String> miSet = new HashSet<>(); 
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo"); 
        miSet.add("Domingo");

        System.out.println("");
        System.out.println("Interface Set");
        System.out.println("----------------");

        imprimir(miSet);
        
        //<tipo de la llave y tipo del valor.>
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("Llave1", "Valor asociado a Llave1");
        miMapa.put("Llave2", "Valor asociado a Llave2");
        miMapa.put("Llave3", "Valor asociado a Llave3");
        miMapa.put("Llave3", "Valor asociado a Llave3 duplicado"); //Si creamos una copia del anterior llave3 e indicamos un valor diferente, lo que hace Map es sustituir el valor principal por el ultimo agregado.
        
         System.out.println("");
        System.out.println("Interface Map");
        System.out.println("----------------");
        //Acceder a los elementos del Map:
        //Y gracias a indicar el tipo a la interface y a la clase de la variable miMapa, ya no es necesario hacer la conversion: String elemento = (String) miMapa.get("Llave1");
        //Si no que directamente podemos obtenerlo sin hacerla.
        String elemento = miMapa.get("Llave1");
//        System.out.println("elemento: " + elemento);
        
        //Y para recuperar todas las llaves:
        imprimir(miMapa.keySet()); 
        imprimir(miMapa.values()); 
    }

    
    //Ahora nuestro metodo solamente acepta en su parametro, objetos de tipo String: Collection<String>
    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento: " + elemento);
        });
    }
    
    /*basicamente un map es una coleccion de elementos pero almacenado en el concepto de llave/valor, asi que por cada llave que agreguemos, le asociaremos un valor*/
}
