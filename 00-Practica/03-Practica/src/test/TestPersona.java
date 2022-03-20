package test;

import domain.*;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Usuario("CodeBrielz","Gabriel","Valentin",23);
        System.out.println("persona = " + persona.mensajeAUsuario());
    }
}
