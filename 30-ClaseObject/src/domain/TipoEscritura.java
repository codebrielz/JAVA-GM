package domain;

public enum TipoEscritura {
    
    //enums constants
    CLASICO("Escritura a mano"),//<-- ojo con la coma
    MODERNO("Escritura digital");
    
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
