package EMS;

public class Odsustvo {
    public String ime;
    public String prezime;
    public int JMBG;
    public String vrstaOdsustva;
    public String datumOdlaska;
    public String datumDolaska;

    public Odsustvo (String ime, String prezime, int JMBG, String vrstaOdsustva, String datumOdlaska, String datumDolaska) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.vrstaOdsustva = vrstaOdsustva;
        this.datumOdlaska = datumOdlaska;
        this.datumDolaska = datumDolaska;
    }

    public String toString() {
        return this.ime + " " + this.prezime + ", " + this.JMBG + ", " + this.vrstaOdsustva + ", " + this.datumOdlaska + " - " + this.datumDolaska + "\n";
    }
}