package domain;

//NO PODEMOS HEREDAR DE UNA CLASE MARCADA COMO FINAL.
// public class Empleado extends Persona{}
public class Empleado extends Persona{
    //sobreescrituro de un metodo padre.
    //Pero este metodo no se puede sobreescribir ya que hemos marcado como final el metodo de la clase padre.
//     public void imprimir(){
//        System.out.println("metodo final imprimir desde clase hija");
//    }
    
    @Override
     public void imprimir(){
        System.out.println("imprimir metodo desde clase hija (SOBREESCRITO EL METODO)");
    }
}
