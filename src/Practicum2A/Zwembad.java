package Practicum2A;

import java.util.zip.ZipEntry;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){
    }
    public double inhoud(){
        return breedte * lengte * diepte;
    }
    public void setbreedte(double breedte){
        this.breedte = breedte;
    }
    public void setlengte(double lengte){
        this.lengte = lengte;
    }
    public void setdiepte(double diepte){
        this.diepte = diepte;
    }
    public double getbreedte(){
        return breedte;
    }
    public double getlengte() {
        return lengte;
    }
    public double getdiepte() {
        return diepte;
    }
    public String toString(){
       return "GEGEVENS ZWEMBAD: Dit zwembad is " +breedte +" meter breed, " + lengte + " meter lang, en " + diepte + "meter diep";
    }
}
