
package domain;

//Para poder utilizar metodos y atributos abstractos, la clase tiene que ser abstracta tambien
public abstract class FiguraGeometrica {
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //Los metodos abstractos no tienen porque estár definidos, ya que podemos inicializarlos sin saber cual será su comportamiento, y definir el comportamiento
    //Una vez sepamos que hará.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }
    
    
}
