package Practicum2A;

import java.util.zip.ZipEntry;

public class Zwembad {
    private Double Breedte;
    private Double Lengte;
    private Double Diepte;

    public Zwembad(Double Breedte, Double Lengte, Double Diepte) {
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }
    public Zwembad(){
    }
    public Double inhoud(){
        return Breedte * Lengte * Diepte;
    }
    public void setBreedte(Double Breedte){
        this.Breedte = Breedte;
    }
    public void setLengte(Double Lengte){
        this.Lengte = Lengte;
    }
    public void setDiepte(Double Diepte){
        this.Diepte = Diepte;
    }
    public Double getBreedte(){
        return Breedte;
    }
    public Double getLengte() {
        return Lengte;
    }
    public Double getDiepte() {
        return Diepte;
    }
    public String toString(){
       return "GEGEVENS ZWEMBAD: Dit zwembad is " +Breedte +" meter breed, " + Lengte + " meter lang, en " + Diepte + "meter diep";
    }
}
