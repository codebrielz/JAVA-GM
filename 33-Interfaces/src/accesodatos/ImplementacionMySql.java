package accesodatos;

//implements es para implementar una interface a nuestra clase 
/*
Si no indicamos los metodos de la interface, nos obliga a poner abstract en la misma linea de la inicializacion de la clase:
public abstract class ImplementacionMySql implements IAccesoDatos{};
Pero si hacemos esto, tendriamos que crear una clase hija para poder utilizar los metodos de la clase padre abstracta
 */
/*
Lo que conseguimos es que las clases que quieran heredar el comportamiento de la interface, se verán obligadas a implementar todos sus metodos abstractos 
*/
public class ImplementacionMySql implements IAccesoDatos {

    //Implementamos los metodos de la interface
    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");

    }

}
