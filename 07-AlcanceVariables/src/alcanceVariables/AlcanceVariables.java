package alcanceVariables;

public class AlcanceVariables {

    // atributos
    int a;
    int b;

    // constructor vacio
    public AlcanceVariables() {
        this.a = 10;
        this.b = 10;
    }

    // constructor con argumentos
    public AlcanceVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int sumar() {
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return sumar();
    }

}