
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("AOC", 16.0);
        Teclado teclado = new Teclado("Razer", "Bluethoot");
        Raton raton = new Raton("Razer", "Bluethoot");
        Computadora computadora = new Computadora("Computadora", monitor, teclado, raton);
        
        Monitor monitorGamer = new Monitor("AOC Curva", 18.0);
        Teclado tecladoGamer = new Teclado("Sony", "Cable");
        Raton ratonGamer = new Raton("Sony", "Cable");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadoraGamer);
        
        orden.mostrarOrden();
    }
}
