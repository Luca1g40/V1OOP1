package Les4.opdracht1;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier huisdier;

    public Eigenaar(String nm) {
        naam = nm;

    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr() { return giroNr; }

    public void setBeestje(Huisdier huisdier){
        this.huisdier = huisdier;
    }
    public Huisdier getBeestje(){
        return huisdier;
    }

    public String getNaam() { return naam; }

    public String toString() {
        String baasjeinfo = "";
        String huisdierinfo = "";

        if(huisdier == null){
           baasjeinfo += naam + " heeft giro " + giroNr;
           huisdierinfo += "en is het baasje van: null";
        }
        else {
            baasjeinfo += naam + " heeft giro " + giroNr;
            huisdierinfo += "en is het baasje van: " + huisdier;
        }
        return baasjeinfo + huisdierinfo;

    }

}