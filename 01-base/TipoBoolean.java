public class TipoBoolean {
    public static void main(String[] args) {
        /**
         * Los boolean se les conoce tambien como tipo bandera: es como un semaforo, si
         * está en verde (true) podemos continuar, si está en rojo (false) debemos
         * detenernos
         */
        boolean varBooleanTrue = true;
        boolean varBooleanFalse = false;

        boolean varBoolean = false;
        if (varBoolean) {
            // true
            System.out.println("El valor de varBoolean es: " + varBoolean);
        } else {
            // false
            System.out.println("El valor de varBoolean es: " + varBoolean);
        }

        // Inferir tipo boolean en var
        var esTrueOrFalse = true; // boolean esTrueOrFalse
        if (esTrueOrFalse) {
            System.out.println("Si es verdadero, se muestra esto: " + esTrueOrFalse);
        } else {
            System.out.println("Si es falso, se muestra esto: " + esTrueOrFalse);
        }

        // Ejercicio para trabajar las condiciones booleanas:
        // Creacion de un usuario ficticio:
        var usuario = "Miguel"; // String usuario
        var edad = 24; // int edad

        // Programa que condiciona la edad de la persona:
        if (edad > 18 && edad < 26) {
            System.out.println("Hola " + usuario + ", si tienes más de 18 años y menos de 26, puedes pasar pagando!");
        } else if (edad > 26 && edad <= 36) {
            System.out.println("Hola " + usuario + ", si tienes más de 26 años y menos de 36, puedes pasar sin pagar!");
        } else {
            System.out.println("Hola " + usuario + ", si no tienes entre 18 y 36 años, no puedes pasar!");
        }
    }
}
