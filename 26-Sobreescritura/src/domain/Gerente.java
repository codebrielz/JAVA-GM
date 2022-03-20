
package domain;


public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        //super.obtenerDetalles() lo ponemos para acceder a la informacion anterior y concatenarlo con la informacion que queremos agregar.
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
}
