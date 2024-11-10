package primjer02;

import java.util.ArrayList;

public class Kolegij {
	String nazivKolegija;
	int ECTS;
	ArrayList<Integer> ocjene;
	//Konstruktor
	public Kolegij(String nazivKolegija, int ECTS) {
		this.nazivKolegija = nazivKolegija;
		this.ECTS = ECTS;
		this.ocjene = new ArrayList<>();
	}
	//Metoda za dodavanje ocjena
	 public void dodajOcjenu(int ocjena) {
	        if (ocjena >= 1 && ocjena <= 5) {
	            ocjene.add(ocjena);
	        } else {
	            System.out.println("Neispravna ocjena, molimo unesite ocjenu između 1 i 5.");
	        }
	    }
	 //Metoda za izracun prosjeka
	public double izracunajProsjek() {
		double zbroj=0;
		for(int i=0;i<ocjene.size();i++) {
			zbroj+=ocjene.get(i);
		}
		double prosjekOcjena = zbroj/ocjene.size();
		return prosjekOcjena;
	}
	
	public void ispisiImeKolegija() {
		System.out.println(nazivKolegija);
	}
	public void ispisiDetaljeKolegija() {
		System.out.println("Naziv kolegija: "+nazivKolegija);
		System.out.println("ECTS bodovi: "+ECTS);
		System.out.println("-----------------");
		System.out.println("Prosjek ocjena iznosi: ");
	}
	@Override
	public String toString() {
		return nazivKolegija+"("+ECTS+" ECTS)";
	}
}