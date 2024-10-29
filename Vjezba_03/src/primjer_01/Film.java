package primjer_01;

public class Film {
    private String naslov;
    private String zanr;
    private int trajanje;
    private boolean prikazujeSe;

    public Film(String naslov, String zanr, int trajanje) {
        this.naslov = naslov;
        this.zanr = zanr;
        this.trajanje = trajanje;
        this.prikazujeSe = false;
    }

    public void zapocniPrikazivanje() {
        this.prikazujeSe = true;
    }

    public void zavrsiPrikazivanje() {
        this.prikazujeSe = false;
    }

    public void ispisiDetalje() {
        String stanje = prikazujeSe ? "prikazuje" : "ne prikazuje";
        System.out.println("Film: " + naslov + ", Žanr: " + zanr + ", Trajanje: " + trajanje + " min, Trenutno: " + stanje);
    }

    public String getNaslov() {
        return naslov;
    }
}
