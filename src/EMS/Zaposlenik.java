package EMS;

public class Zaposlenik {
    public String email;
    public String sifra;
    public String ime;
    public String prezime;
    public int JMBG;
    public String mjestoRodenja;
    public String mjestoPrebivalista;
    public int brTelefona;
    public String pozicija;
    public String sektor;

    public Zaposlenik (String ime, String prezime, int JMBG, String mjestoRodenja, String mjestoPrebivalista, int brTelefona, String pozicija, String sektor, String email, String sifra) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.mjestoRodenja = mjestoRodenja;
        this.mjestoPrebivalista = mjestoPrebivalista;
        this.brTelefona = brTelefona;
        this.pozicija = pozicija;
        this.sektor = sektor;
        this.email = email;
        this.sifra = sifra;
    }

    public String toString() {
        return this.ime + " " + this.prezime + ", " + this.JMBG + ", " + this.mjestoRodenja + ", " + this.mjestoPrebivalista + ", " + this.brTelefona + ", " + this.pozicija + ", " + this.sektor + ", " + this.email + "; " + "\n";
    }
}
