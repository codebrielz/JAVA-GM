package src.operaciones;

public class AritmeticaConstructores {

    // atributos
    int a = 0;
    int b = 0;

    // Sobrecarga de constructores (es cuando agregas 2 o más constructores a la
    // misma clase)
    // Constructor vacio
    public AritmeticaConstructores() {
        // valores por defecto a los atributos
        this.a = 10;
        this.b = 10;
    }

    // constructor con parametros
    public AritmeticaConstructores(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumaConRetorno() {
        return this.a + this.b;
    }

    public int sumaConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return sumaConRetorno();
    }

}
