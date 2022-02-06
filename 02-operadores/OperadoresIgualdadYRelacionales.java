public class OperadoresIgualdadYRelacionales {
    public static void main(String[] args) {

        var a = 3;
        var b = 2;

        // Operador igualdad (==) (compara las referencias que almacenan las variables
        // que apuntan a objetos)
        var c = (a == b); // false
        System.out.println("c = " + c);

        // Operador diferente a (!=) (compara las referencias que almacenan las
        // variables que apuntan a objetos)
        var d = a != b; // true
        System.out.println("d = " + d);

        // Metodo Equals (para Strings)

        var e = "Hola";
        var f = "Adios";

        var g = (e.equals(f)); // false (compara el contenido de la cadena)
        System.out.println("g = " + g);
        var h = (e == f); // false (compara referencias de objetos y no el contenido de la cadena)
        System.out.println("h = " + h);
    }
}
