package primjer_02;

public class Knjiga {
    String naslov;
    String autor;
    int godinaIzdavanja;
    boolean dostupno;

    public Knjiga(String naslov, String autor, int godinaIzdavanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = godinaIzdavanja;
        this.dostupno = true; // Knjiga je dostupna po defaultu
    }

    public void setDostupno(boolean dostupno) {
        this.dostupno = dostupno;
    }

    public boolean isDostupno() {
        return dostupno;
    }

    @Override
    public String toString() {
        return "Knjiga: " + naslov + " od " + autor + " (" + godinaIzdavanja + ")";
    }
}
