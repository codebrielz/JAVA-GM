public class OperadoresUnarios {
    public static void main(String[] args) {

        System.out.println("-- CAMBIO DE SIGNO --");

        var a = 3; // 3
        System.out.println("a = " + a);
        // Operador de cambio de signo (Indicandole un operador aritmetico delante de la
        // variable)
        var b = -a; // -3
        System.out.println("b = " + b);

        System.out.println("-- INVERTIR BOOLEAN --");

        // Invertir boolean
        var c = true;
        System.out.println("c = " + c);
        var d = !c; // false
        System.out.println("d = " + d);

        // Incremento o decremento:

        System.out.println("-- INCREMENTO --");

        // Preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // Primero se incrementa la variable y despues utiliza el valor //4
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // Postincremento (simbolo despues de la variable)
        var g = 3;
        var h = g++; // Primero se utiliza el valor y la siguiente vez que se ejecuta se incrementa
        // //3
        System.out.println("g = " + g); // 4 (INCREMENTO PENDIENTE)
        System.out.println("h = " + h); // 3 (Primero se guarda el valor y en la siguiente se incrementa)

        System.out.println("-- DECREMENTO --");

        // Predecremento (simbolo antes de la variable)
        var i = 3;
        var j = --i; // Primero se decrementa la variable y despues utiliza el valor //2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Postdecremento (simbolo despues de la variable)
        var k = 3;
        var l = k--; // Primero se utiliza el valor y la siguiente vez que se ejecuta se decrementa
        // //3
        System.out.println("k = " + k); // 2 (DECREMENTO PENDIENTE)
        System.out.println("l = " + l); // 3 (Primero el valor es guardado y despues decrementado)

    }
}
