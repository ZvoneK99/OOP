package Datum; 

public class Datum {
    int dan; // Polje za pohranu dana datuma
    int mjesec; // Polje za pohranu mjeseca datuma
    int godina; // Polje za pohranu godine datuma

    // Konstruktor za inicijalizaciju objekta Datum s danom, mjesecom i godinom
    public Datum(int dan, int mjesec, int godina) {
        this.dan = dan;
        this.mjesec = mjesec;
        this.godina = godina;
    }

    // Metoda za usporedbu trenutnog objekta Datum s drugim objektom Datum
    public int compareTo(Datum pomocniDatum) {
        // Ako se godine razlikuju, vraća se razlika između godina
        if (this.godina != pomocniDatum.godina) {
            return this.godina - pomocniDatum.godina;
        }
        // Ako su godine jednake, provjerava se razlika između mjeseci
        else if (this.mjesec != pomocniDatum.mjesec) {
            return this.mjesec - pomocniDatum.mjesec;
        }
        // Ako su i godine i mjeseci isti, vraća se razlika između dana
        else {
            return this.dan - pomocniDatum.dan;
        }
    }

    // Metoda za ispis datuma u formatu "dan.mjesec.godina."
    @Override 
    public String toString() {
        return dan + "." + mjesec + "." + godina + ".";
    }
}
