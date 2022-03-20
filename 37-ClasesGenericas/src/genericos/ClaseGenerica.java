package genericos;

//Utilizamos una T para indicar el tipo que vamos a proporcionar al momento de utilizar esta clase, asi que internamente
//esta clase utilizará un atributo, pero el tipo del atributo no lo vamos a conocer hasta el momento en que utilicemos
//esta clase.
public class ClaseGenerica<T> {
    private T objeto; //aun no sabemos su tipo
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
    }
}
