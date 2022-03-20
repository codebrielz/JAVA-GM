
public class CicloFor {
    public static void main(String[] args) {

        String[] heroes = new String[4];

        heroes[0] = "Superman";
        heroes[1] = "Ironman";
        heroes[2] = "Mujer Maravilla";
        heroes[3] = "Venom";

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(i + ". " + heroes[i]);
        }
    }
}
