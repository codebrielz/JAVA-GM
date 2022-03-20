
package accesodatos;

/*
    Cuando trabajamos con interfaces es comun que la primera letra de la interface sea I
    La diferencia entre una clase abstracta y una interface es que la interface la utilizamos cuando el comportamiento es común entre las clases que vamos a crear, y la clase abstracta
    se utiliza cuando tienen caracteristicas comúnes
*/
//Las interfaces pueden extenderse entre ellas como las clases
public interface IAccesoDatos {
    //Los atributos en una interface son constantes
    //Los atributos obligatoriamente tienen que tener un valor en las interfaces
    //ya que las interfaces no tienen constructores
    //tienen metodos pero esos metodos son abstractos
    int MAX_REGISTRO = 10; //public static final int MAX_REGISTRO = 10
    
    //Ahora definimos el comportamiento que van a tener las implementaciones en esta interface
    //Cualquier metodo que agreguemos será publico y abstracto
    void insertar(); //public abstract void insertar() <-- el compilador lo agrega directamente si no lo agregamos
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
