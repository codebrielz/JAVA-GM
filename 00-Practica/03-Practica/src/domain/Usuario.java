package domain;

public class Usuario extends Persona{
    //atributos
    private String nickname;
    
    //Constructor vacio
    public Usuario(){
    }
    
    //Constructor con parametros
    public Usuario(String nickname, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.nickname = nickname;
    }
    
    //Metodos de acceso    
    public String getNickname(){
        return this.nickname;
    }
    public void setNickname( String nickname ){
        this.nickname = nickname;
    }
    
    //Metodos de la interface
    @Override
    public String mensajeAUsuario(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hola! ").append(this.nombre).append(" ");
        sb.append(this.apellido).append(" tienes un nombre muy bonito, y la verdad que has elegido un buen apodo ;), como se te ocurrio ");
        sb.append(this.nickname).append("?");
        return sb.toString();
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append(", nickname=").append(nickname);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
