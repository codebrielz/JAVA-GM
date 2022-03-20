
package domain;

//Aunque aqui no veamos extends Object, todas las clases se heredan de la clase Objecto
//public class Persona extends Object{} NO ES NECESARIO AGREGARLO
public class Persona {
    // private: No se hereda a las clases hijas (Pero podemos utilizar metodos de acceso como get y set)
    // protected: Se hereda a las clases hijas (Está pensado para el concepto de herencia)
    // public: Cualquier clase externa va a poder acceder a este atributo (No es buena practica utilizar public)
    // Si no indicamos su nivel de acceso, usará default o package, y solamente será accesible desde los archivos del mismo paquete
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Cuando tenemos mas de un constructor, se le conoce como sobrecarga de constructores
    
    //Constructor vacio para tener acceso a los valores por defecto de la clase sin necesidad de mandar nada de informacion.
    public Persona(){}

    //Constructor con argumentos para recibir la informacion y depositarla en su debido sitio.
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Constructor con argumentos para recibir la informacion y depositarla en su debido sitio.
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //metodos get y set

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Override: sobreescribe un metodo ya creado anteriormente (En este caso toString pertenece a la clase padre (Object))

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString()); //Ahora super hace referencia a la clase padre de persona es decir a Object
        sb.append('}');
        return sb.toString();
    }
   
    
}
