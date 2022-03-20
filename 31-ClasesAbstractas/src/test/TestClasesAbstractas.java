
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //En la POO lo que queremos conseguir es reutilizar el codigo y hacer algoritmos lo más generico posible, el polimorfismo consigue esto

        //No se pueden crear objetos de una clase abstracta
//        FiguraGeometrica figura = new FiguraGeometrica();

        //PERO SI PODEMOS TRABAJAR CON LAS CLASES HIJAS
        //en este caso, vamos a trabajar con polimorfismo
        FiguraGeometrica figura = new Rectangulo("Rectangulo"); //upcasting: asignar un tipo hijo a un tipo padre.
        figura.dibujar();
        
    }
}
