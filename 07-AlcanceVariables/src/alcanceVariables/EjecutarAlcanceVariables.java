package alcanceVariables;

public class EjecutarAlcanceVariables {
    public static void main(String[] args) {
        // var puede utilizarse cuando trabajamos con variables locales (con el main),
        // por ejemplo en el caso de la clase AlcanceVariables.java no se puede utilizar
        // la palabra reservada var para poder inicializar una variable.
        // variables locales
        var a = 30;
        var b = 40;

        miMetodo();

        AlcanceVariables prueba1 = new AlcanceVariables();
        AlcanceVariables prueba2 = new AlcanceVariables(20, 30);

        var resultado = prueba1.sumarConArgumentos(a, b);
        System.out.println("prueba1 resultado: " + resultado);
        resultado = prueba2.sumarConArgumentos(10, 12);
        System.out.println("prueba2 resultado: " + resultado);
    }

    public static void miMetodo() {
        // la variable a esta fuera del alcance donde fue definido
        // a = 10;
        System.out.println("Este es miMetodo");
    }

}
