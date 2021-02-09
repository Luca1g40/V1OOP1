package Les2.oefencasus;

public class Product {
    private String naam;
    private String code;
    private Double prijs;
    private Double btw;

    public Product(String naam, String code, Double prijs) {
        this.naam = naam;
        this.code = code;
        this.prijs = prijs;
    }
    public Product(String naam, String code) {
        this.naam = naam;
        this.code = code;
    }
    public void setBtw(Double btw){
        this.btw = btw;
    }
    public void setPrijs(Double prijs){
        this.prijs = prijs;
    }
    public Double getBtw() {
        return btw;
    }
    public Double getPrijs(){
        return prijs;
    }
    public void verhoogPrijsMet(Double extra){
        prijs += extra;
    }
    public Double btwBedrag(){
        return prijs * (btw/100);
    }
    public String toString(){
        String s = naam + " heeft code " +code+ " en kost ";
        s = s + prijs + "; de btw is " + btw+ "%";
        return s;

    }
}
