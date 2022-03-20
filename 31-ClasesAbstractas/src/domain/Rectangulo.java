package domain;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //Y tenemos que implementar el metodo dibujar OBLIGATORIAMENTE en las clases hijas
    //CUANDO SE IMPLEMENTA YA NO PONEMOS ABSTRACT
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName()); //getSimpleName, es para indicar directamente el nombre del archivo, getClass indica el nombre del paquete y del archivo
    }
}
