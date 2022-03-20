public class Caja {
    int ancho, alto, profundo;

    public Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int multiplicar() {
        return ancho * alto * profundo;
    }

    public int calcularVol(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        return multiplicar();
    }

}