package primjer02;

import java.util.ArrayList;

public class Ispit {
	String nazivKolegija;
	String datum;
	ArrayList<Integer>ispiti;
	 int rezultat;
	
	public Ispit(String nazivKolegija, String datum, int rezultat) {
		this.nazivKolegija = nazivKolegija;
		this.datum = datum;
		this.rezultat = rezultat;
		this.ispiti = new ArrayList<>();
	}
	public void dodajRezultat(int rezultat) {
        if (rezultat >= 1 && rezultat <= 5) { // Provjera ispravnosti rezultata
            this.ispiti.add(rezultat);
        } else {
            System.out.println("Neispravan rezultat. Unesite broj između 1 i 5.");
        }
    }
	public void ispisiDetaljeIspita() {
		System.out.println("-------------------");
		System.out.println("Naziv kolegija: "+nazivKolegija);
		System.out.println("Datum ispita: "+datum);
		System.out.println("Rezultat na ispitu: "+rezultat);
		System.out.println("-------------------");
	}
}
