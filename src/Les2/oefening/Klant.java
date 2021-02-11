package Les2.oefening;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


    public void setMijnRekening(Rekening rekening) {
        this.mijnRekening = rekening;
    }

    public Rekening getMijnRekening(){
        return this.mijnRekening;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String toString(){
        String klantinfo = getNaam() + " " + " Woont in " + plaats;
        String rekeninginfo = this.mijnRekening.toString();
        return klantinfo + "\n" + rekeninginfo;
     }
}
