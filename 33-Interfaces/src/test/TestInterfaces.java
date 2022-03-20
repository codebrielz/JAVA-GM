package test;

import accesodatos.*;

public class TestInterfaces {

    public static void main(String[] args) {
        //Creamos variable del tipo de la interface
        //Pero no se puede crear una instancia directamente de la interface ya que no es una clase, tenemos que crear la instancia a la clase que contenga la relacion con la interface.
        //Esto tambien es polimorfismo, ya que si llamamos a un metodo en común entre la interface y la clase a la que estamos apuntando, ejecutará 
        //el codigo de la clase a la que estamos creando la instancia (es decir, a la que estamos apuntando)
        IAccesoDatos datos = new ImplementacionMySql();
//        datos.insertar();
//        datos.listar();
        imprimir(datos);

        datos = new ImplemetacionOracle(); //Le indicamos una nueva referencia a la variable datos
//        datos.insertar();
//        datos.listar();

        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.actualizar();
    }
}
