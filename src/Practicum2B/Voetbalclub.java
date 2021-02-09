package Practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        if (naam == null || naam.equals("")) {
            this.naam = "FC"; }
        else {
            this.naam = naam; }
    }
    public int aantalGespeeld(){
        return aantalGelijk + aantalGewonnen + aantalVerloren;

    }

    public String getNaam(){
        return this.naam;
    }

    public int aantalPunten(){
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        else if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        else if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String toString(){
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
