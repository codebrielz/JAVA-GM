public class EjecutarCaja {
    public static void main(String[] args) {

        Caja prueba1 = new Caja();
        prueba1.alto = 10;
        prueba1.ancho = 10;
        prueba1.profundo = 10;
        var resultado = prueba1.multiplicar();
        System.out.println("resultado: " + resultado);
        resultado = prueba1.calcularVol(6, 6, 6);
        System.out.println("resultado: " + resultado);
    }
}
