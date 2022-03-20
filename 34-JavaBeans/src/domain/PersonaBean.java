package domain;

import java.io.Serializable;
import java.util.Objects;

/*
Para que una clase en JAVA se considere JAVABEAN, es que debe de cumplir ciertas caracteristicas, por ejemplo debe tener un constructor vacio y
cada atributo que definamos dentro de esta clase JAVABEAN debe ser un atributo privado y cada atributo privado, debe tener un metodo set y get asociado y por ultimo debe implementar
una interface llamada serializable, dicha interface nos va a permitir enviar nuestra clase entre diferentes equipos, por ejemplo si tenemos diferentes servidores de JAVA y
necesitamos transferir esta clase de java este JAVABEAN entre diferentes equipos, entonces será importante implementar la interface Serializable
*/
public class PersonaBean implements Serializable {
    private String nombre;
    private String apellido;
    
    //El constructor debe de ser publico
    public PersonaBean(){
    }
    
    public PersonaBean(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
     public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaBean other = (PersonaBean) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonaBean{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
}
