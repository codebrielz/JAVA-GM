package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        /*
        Cuando trabajamos con polimorfismo necesitamos tener el concepto de herencia y ademas, ya haber sobreescrito desde la clase hija un metodo de la clase padre.
        Polimorfismo significa, multiple comportamientos, sin embargo este comportamiento a veces es dificil de entender ya que solamente podremos visualizarlo en tiempo de ejecucion,
        desde el compilador no podemos observar como se implementa el polimorfismo, si no que hasta que ejecutamos nuestro programa, nos vamos a dar cuenta como funciona el polimorfismo
         */
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado: " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente1 = new Gerente("Karla", 10000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);
        
    }

    /*
      Polimorfismo consiste en poder llamar a un metodo original o sobreescrito dependiendo de donde apunta la referencia, y como por ejemplo, Empleado es padre de Gerente,
      podemos enviar como argumento gerente1 y recibirlo como parametro y realizar el metodo sobreescrito de la subClase Gerente.
    */
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado= " + empleado.obtenerDetalles());

    }
}
