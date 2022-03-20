package test;

import dominio.Persona;
// import dominio.*; llama TODAS las clases que se encuentren en ese paquete, pero no carga ninguna clase a menos que la llamemos (y solamente cargaria esa clase llamada) por ende, no sería una carga innecesaria de memoria 

public class PersonaPrueba {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 5.000, false);
        persona.setNombre("Alex");
        // System.out.println("persona: " + persona.getNombre());
        System.out.println("persona: " + persona.toString());
    }
}
