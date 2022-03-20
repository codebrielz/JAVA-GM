package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var result = Operaciones.sumar(2.30, 3.10);
        System.out.println("result: " + result);
        var result2 = Operaciones.sumar(2, 3);
        System.out.println("result2: " + result2);

        var result3 = Operaciones.sumar(3L, 2);
        System.out.println("result3: " + result3);
    }
}
