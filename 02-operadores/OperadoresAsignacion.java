public class OperadoresAsignacion {
    public static void main(String[] args) {
        // Operador de asignacion (=)
        int a = 3, b = 2;
        // La evaluacion se hace de izquierda a derecha (en este caso se evalua primero
        // a + 5 y despues -b)
        int c = a + 5 - b; // 6

        // Operador de asignacion compuesto (+= / -= / *= / /= / %=)
        a += 1; // Incrementa el valor de a en 1, es decir, si el valor de a es 3, pues ahora
                // será 4, esto sería lo mismo que hacer esto: a = a + 1;
        a += 3; // 7 (a = a + 3);
        System.out.println(a);
        a -= 2; // 5 (a = a - 2);
        System.out.println(a);
        a *= 3; // 15 (a = a * 3);
        System.out.println(a);
        a /= 2; // 7,5 (PERO es 7 porque lo redondea al numero inicial (ya que estamos
                // utilizando un integer y no un float o double)) (a = a / 2);
        System.out.println(a);

    }
}