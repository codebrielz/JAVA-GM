package test;

// 3 FORMAS DE UTILIZAR UN METODO ESTATICO

//Imports de las clases que utilizaremos
//import com.codebrielz.* <-- Asi se obtiene todas las clases del paquete
//1 - import com.codebrielz.Utileria; 

//Importar metodos staticos
//2 - import static com.codebrielz.Utileria.imprimir; // <-- Esto solamente se aplica para metodos estaticos

public class TestUtileria {
    public static void main(String[] args) {
        //1 - Utileria.imprimir("Hola Mundo");
        //2 - imprimir("Hola Mundo");
        com.codebrielz.Utileria.imprimir("Hola Mundo");
    }
}
