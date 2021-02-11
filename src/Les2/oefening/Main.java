package Les2.oefening;

public class Main {
    public static void main(String[] args){
        Rekening r1 = new Rekening(43242234);
        Klant k1 = new Klant("Ruben", "jo", "Spakenburg");
        k1.setMijnRekening(r1);
        r1.stort(123.45);

        System.out.println(k1.toString());
    }
}
