package operaciones;

public class Operaciones {

    /*
     * Sobrecarga de metodos.
     * Agregaremos el metodo de sumar() varias veces, sin embargo, este metodo
     * aunque se vaya a llamar igual varias veces va a tener diferentes parametros y
     * con esto vamos a cumplir el concepto de sobrecarga de metodos
     * Entonces, la sobrecarga de metodos es definir dos o más veces el metodo a
     * utilizar pero poniendo el mismo nombre y para hacer diferencia entre estos
     * metodos, ya que se llaman iguales, se diferenciarán por la cantidad de
     * argumentos.
     */

    // Este recibe dos tipos enteros.
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Este recibe dos tipos double.
    public static double sumar(Double a, Double b) {
        return a + b;
    }

}