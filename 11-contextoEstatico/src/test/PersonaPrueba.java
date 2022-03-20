package test;

import domain.Persona;

public class PersonaPrueba {

    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Susan");
        System.out.println("persona1 nombre: " + persona1);
        persona1.setNombre("Angy");
        System.out.println("persona1 nombre modificado: " + persona1);

        Persona persona2 = new Persona("Koko");
        System.out.println("persona2 nombre: " + persona2);

        imprimirPersona(persona1);

        // No podemos acceder desde un metodo estatico a un metodo u objeto dinamico.
        // this.getContador(persona1); NO SE PUEDE LLAMAR A UN METODO DINAMICO DENTRO DE
        // UN METODO ESTATICO
    }

    // METODOS ESTATICOS
    // Si llamamos queremos llamar un metodo dentro de otro metodo que es estatico,
    // tenemos que hacer que este metodo TAMBIEN sea estatico.
    // Dentro de un metodo estatico no podemos utilizar la palabra reservada this
    public static void imprimirPersona(Persona persona) {
        System.out.println("Persona: " + persona);
    }

    public int getContador() {
        // Pero si podemos acceder desde un metodo dinamico a un metodo u objeto
        // statico.
        imprimirPersona(new Persona("persona"));
        return this.contador;
    }
}
