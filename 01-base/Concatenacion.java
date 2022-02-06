import java.text.ParseException;

public class Concatenacion {
    public static void main(String[] args) {

        // Recordatorio: var infiere el tipo de dato.
        var nombre = "Angela";
        var apellidos = "Poch Macias";
        var titulo = "Ingeniera";

        var concatenacionDeNombreYApellido = nombre + " " + apellidos;
        System.out.println(concatenacionDeNombreYApellido + " - " + titulo);

        // tipos enteros
        // NO ES RECOMENDABLE: poner nombres tan cortos en nuestras variables
        var i = 3;
        var j = 4;
        // sumar:
        // Si al evaluar el valor encuentra dos tipos numeros, primero sumará
        // y despues si encuentra tipo string, concatenará
        var resSuma = i + j + " es el resultado de la suma"; // 7 es el resultado de la suma

        // Concatenar numeros convirtiendolos a string (contexto cadena):
        // Si al evaluar el valor encuentra primero un string, todo lo demás lo
        // concatenará
        var resNumString = "Concatenando: " + i + j;// Concatenando: 34

        System.out.println(resSuma);
        System.out.println(resNumString);

        // Estableciendo prioridades:
        var usuario = "El usuario Santo a sacado un total de: ";
        var nota = 6;
        var nota2 = 8;

        // Los parentesis establecen prioridad en la suma, entonces primero se ejecuta
        // la suma y despues la concatenacion.
        var resultadoPrioritario = usuario + (nota + nota2);

        System.out.println(resultadoPrioritario);

    }
}
