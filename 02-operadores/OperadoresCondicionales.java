public class OperadoresCondicionales {
    public static void main(String[] args) {
        // Operadores condicionales
        var a = 12;
        var valorMinimo = 0;
        var valorMaximo = 10;

        // Operador AND (&&) Si un valor es falso, NO se ejecutará el scope de true
        if (a >= valorMinimo && a <= valorMaximo) {
            System.out.println("La variable a que tiene un valor de " + a + " entra en el rango del valor minimo: "
                    + valorMinimo + " y valor maximo: " + valorMaximo);
        } else {
            System.out.println("Fuera de rango");
        }

        // Operador OR (||) Si un valor es verdadero, se ejecutará el scope de true
        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso) {
            System.out.println("Puede asistir al juego del hijo");
        } else {
            System.out.println("El padre está ocupado");
        }
    }
}
