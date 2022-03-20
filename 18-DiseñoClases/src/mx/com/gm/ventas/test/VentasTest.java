
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        //Generamos el objeto Producto añadiendo los valores que queramos
        Producto producto1 = new Producto("Camisa",1200);
        Producto producto2 = new Producto("Pantalon",2600);
        
        //Y lo pasamos a la clase Orden para poder crear la orden correspondiente.
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
        
    }
}
