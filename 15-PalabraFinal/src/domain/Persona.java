package domain;

//NO PODEMOS TENER CLASES HIJAS AL TENER COMO MARCADA FINAL ESTA CLASE.
//public final class Persona {
public class Persona {
    
    //atributo
    // final static, en java esto se le conoce como una constante
    // EN java se acostumbra a escribir en MAYUSCULAS las constantes, y si tienen mas de una palabra, se separan por guiones bajos
    // public para acceder a esta constante desde otra clase
    public final static String VALOR_CONSTANTE = "Hola";
    
    private String nombre;
    
//    public final void imprimir(){
//        System.out.println("metodo final imprimir");
//    }
    public void imprimir(){
        System.out.println("imprimir metodo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
