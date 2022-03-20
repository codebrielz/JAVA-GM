package domain;

public class Persona {

    //Atributo
    private String nombre;
    
    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Metodos get&set
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { ");
        sb.append("Nombre= ").append(nombre);
        sb.append(", Direccion de memoria= ").append(super.toString());
        sb.append(" }");
        return sb.toString();
    }
    
}
