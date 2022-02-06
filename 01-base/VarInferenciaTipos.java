public class VarInferenciaTipos {
    public static void main(String[] args) {

        var numeroEntero = 30; // var infiere: int numeroEntero
        System.out.println("var numeroEntero: " + numeroEntero);

        var numeroDouble = 30.0; // var infiere: double numeroDouble
        System.out.println("var numeroDouble: " + numeroDouble);

        var numeroFloat = 10.0F; // var infiere: float numeroFloat
        System.out.println("var numeroFloat: " + numeroFloat);

    }
}
