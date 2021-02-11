package Les4.opdracht1;

public class Huisdier {

    private String naam;
    private String ras;
    private double gewicht;
//    private Eigenaar eigenaar;

    public Huisdier(String naam, String ras) {
        this.naam = naam;
        this.ras = ras;
        this.gewicht = 0.0;
    }

    public String getNaam() {
        return naam;
    }
//    public void setBaasje(Eigenaar eigenaar){
//    this.eigenaar = eigenaar;
//    }

//    public Eigenaar getBaasje(){
//        return eigenaar;
//    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        String huisdierinfo = naam + ", de " + ras + ", weegt " + gewicht + " kg.";
        return huisdierinfo;
    }
}