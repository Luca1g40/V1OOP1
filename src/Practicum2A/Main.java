package Practicum2A;

public class Main {
    public static void main(String[] arg) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getbreedte());
        System.out.println("LENGTE: " + z1.getlengte());
        System.out.println("DIEPTE: " + z1.getdiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad( );
        z2.setbreedte(2.5);
        z2.setlengte(100.0);
        z2.setdiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.inhoud());
    }
}