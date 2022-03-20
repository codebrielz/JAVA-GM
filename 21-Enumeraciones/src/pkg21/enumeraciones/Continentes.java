
package pkg21.enumeraciones;

public enum Continentes {
    //Proporcionamos cuantos paises tiene cada continente con un parentesis
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "801 millones"),
    ASIA(44, "4.7 billones"),
    AMERICA(34, "1 billon"),
    OCEANIA(14, "40 millones");
    private final int paises;
    private final String habitantes;
    
    //Tenemos que definir el constructor de la enum para poder enviar los valores de cada enumeracion por parentesis.
    Continentes(int paises, String habitantes){
        this.paises = paises; //y lo almacenamos
        this.habitantes = habitantes;
    }
    
    //Metodo para obtener las enumeraciones
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
