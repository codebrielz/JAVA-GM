
package mx.com.gm.ventas;

public class Producto {
    //Atributos
    private final int idProducto;
    protected String nombre;
    protected double precio;
    private static int contadorProductos;
    
    //Constructor vacio (ya que no tiene argumentos)
    public Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    //Constructor con argumentos
    public Producto(String nombre, double precio){
        //Llamo al constructor interno de esta clase
        this();
        //Asigno el valor del argumento al atributo de la clase
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Metodos de acceso y modificacion.
    public int getIdProducto(){
        return this.idProducto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setNombre(double precio){
        this.precio = precio;
    }
    
    //Sobreescribo el metodo toString de la clase Object para mostrar la informacion de esta clase.
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(this.idProducto).append(", ");
        sb.append("Nombre: ").append(this.nombre).append(", ");
        sb.append("Precio: ").append(this.precio).append(", ");
        return sb.toString();
    }
    
}
