public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Definiendo varias variables separandolas con ,
        int a = 3, b = 2;

        var resultado = a + b; // Operador aritmetico: +
        System.out.println("resultado operador aritmetico + : " + resultado);

        resultado = a - b; // Operador aritmetico: -
        System.out.println("resultado operador aritmetico - : " + resultado);

        resultado = a * b; // Operador aritmetico: *
        System.out.println("resultado operador aritmetico * : " + resultado);
        System.out.println("El TIPO de los resultados operadores aritmeticos, + - *, es de tipo: "
                + ((Object) resultado).getClass().getSimpleName());

        // Las divisiones son casos más especiales, el ideal sería almacenarlo en una
        // variable tipo Double y no int, entonces creamos una nueva variable para su
        // caso
        // double resultadoTipoDouble
        var resultadoTipoDouble = (double) a / b; // Operador aritmetico: /
        System.out.println("resultado operador aritmetico /: " + resultadoTipoDouble);
        System.out.println("El TIPO del resultado operador aritmetico / es de tipo: "
                + ((Object) resultadoTipoDouble).getClass().getSimpleName());

        // Operador de modulo: %
        resultado = a % b; // hace una division, y el residuo de la misma, la asignará a la variable
        System.out.println("resultado operador aritmetico %: " + resultado);

        // verificar si una variable es par o impar:
        // Si la variable a es divisible entre 2, es un numero par, si no, no.
        if (a % 2 == 0) {
            System.out.println("La variable " + a + " es par");
        } else {
            System.out.println("La variable " + a + " es impar");
        }
    }
}