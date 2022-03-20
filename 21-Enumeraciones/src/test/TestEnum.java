
package test;

import pkg21.enumeraciones.Continentes;
import pkg21.enumeraciones.EnumDias;

public class TestEnum {
    public static void main(String[] args) {
        //Accedemos a las enumeraciones como si tratasen de un atributo (ya que lo son)
//        System.out.println("Dia 1: " + EnumDias.LUNES);
//        
//        indicarDiasSemana(EnumDias.MARTES);

        continentesPaisesHabitantes(Continentes.AMERICA);
    }
    
    private static void indicarDiasSemana(EnumDias dias){
        switch( dias ){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
    
    private static void continentesPaisesHabitantes(Continentes continentes){
        switch(continentes){
            case AFRICA:
                System.out.println(continentes.AFRICA + " se compone de " + continentes.getPaises() + " paises " +  "y tiene una poblacion de " + continentes.getHabitantes());
                break;
            case AMERICA:
                System.out.println(continentes.AMERICA + " se compone de " + continentes.getPaises() + " paises " +  "y tiene una poblacion de " + continentes.getHabitantes());
                break;
        }
    }
}
