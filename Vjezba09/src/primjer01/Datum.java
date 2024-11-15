package primjer01;

public class Datum implements Comparable<Datum> {
    private int dan;
    private int mjesec;
    private int godina;

    // Konstruktor
    public Datum(int dan, int mjesec, int godina) {
        this.dan = dan;
        this.mjesec = mjesec;
        this.godina = godina;
    }

    // Metoda za usporedbu datuma
    @Override
    public int compareTo(Datum drugiDatum) {
        if (this.godina != drugiDatum.godina) {
            return Integer.compare(this.godina, drugiDatum.godina);
        } else if (this.mjesec != drugiDatum.mjesec) {
            return Integer.compare(this.mjesec, drugiDatum.mjesec);
        } else {
            return Integer.compare(this.dan, drugiDatum.dan);
        }
    }

    // Metoda za ispis datuma
    @Override
    public String toString() {
        return dan + "." + mjesec + "." + godina + ".";
    }
}
