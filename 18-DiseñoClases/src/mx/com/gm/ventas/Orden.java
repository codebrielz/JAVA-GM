
package mx.com.gm.ventas;

public class Orden extends Producto{
    //Atributos de la clase
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos; //Cuenta los productos agregados a la clase Orden
    private static final int MAX_PRODUCTOS = 10;
    
    //Constructor de la clase
    public Orden(){
        //Asignamos como id el preIncremento del contadorOrdenes
        this.idOrden = ++Orden.contadorOrdenes;
        //Inicializamos el arreglo anteriormente descrito como atributo de la clase.
        productos = new Producto[Orden.MAX_PRODUCTOS]; //Le indicamos el maximo de renglones que contendrá
    }
    
    //Metodo para agregar valores al arreglo
    public void agregarProducto(Producto producto){
        //Si el contadorProductos es mayor que el MAX_PRODUCTOS
       if(this.contadorProductos < Orden.MAX_PRODUCTOS ){
           //Añadimos dinamicamente con la variable contadorProductos un nuevo renglon haciendo un POSTINCREMENTO para empezar desde 0 el arreglo
           // y como valor dentro de ese renglon indicamos el producto que recibimos como argumento.
           productos[this.contadorProductos++] = producto; //postIncremento incrementamos un renglon por cada producto añadido.
       }else{
           System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
       }
    }
    
    public double calcularTotal(){
        //Creamos una variable para administrar el total de la suma de todos los precios
        double total = 0;
        //Iteramos el contadorProductos ya que en agregarProducto lo hemos indicado entre las llaves del
        //arreglo productos, gracias a eso, sabemos cuantos productos disponibles hay.
        for (int i = 0; i < this.contadorProductos; i++) {
            //En una sola linea:
//            total += this.productos[i].getPrecio();
            //Creamos una variable de tipo Producto para que contenga el valor del arreglo productos[]
            Producto producto = this.productos[i];
            //Sumamos el total anterior con el posterior mediante getPrecio() de la clase Producto, que es el encargado de contener
            //todos los precios
            total += producto.getPrecio(); //total = total + producto.getPrecio();
        }
        return total; //Lo retornamos para utilizarlo.
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        //Guardamos en una variable de tipo Double el metodo calcularTotal();
        double totalOrden = this.calcularTotal();
        System.out.println("total de la orden: $" + totalOrden); //<-- lo mostramos
        System.out.println("productos de la orden: ");
        //Iteramos contadorProductos que gracias al metodo agregarProducto, contiene los valores de cada renglon
        //Ya que al indicar que productos[this.contadorProductos++] = producto; añade producto a contadorProductos++
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]); //<--Mostramos todos los productos
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
