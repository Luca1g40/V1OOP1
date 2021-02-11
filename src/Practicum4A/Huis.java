package Practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon huisbaas){
    this.huisbaas = huisbaas;
    }

    public Persoon getHuisbaas(){
        return huisbaas;
    }

    public String toString(){
        String huisInfo = "huis " + adres + " is gebouwd in " + bouwjaar + "\n";
        String huisbaasInfo = "en heeft als huisbaas " + getHuisbaas();
        return huisInfo + huisbaasInfo;
    }
}
