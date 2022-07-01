package EMS;

public class VrijemeRada {
    public String ime;
    public String prezime;
    public int JMBG;
    public String datum;
    public String vriijemeD;
    public String vriijemeO;

    public VrijemeRada (String ime, String prezime, int JMBG, String datum,String vriijemeD, String vriijemeO) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.datum = datum;
        this.vriijemeD = vriijemeD;
        this.vriijemeO = vriijemeO;
    }

    public String toString() {
        return this.ime + " " + this.prezime + ", " + this.datum + " --> " + this.vriijemeD + " - " + this.vriijemeO + "\n";
    }
}
