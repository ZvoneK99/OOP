package Zadatak27;

import java.util.ArrayList;

public class Aerodrom {
	ArrayList<Let> letovi;
	
	public Aerodrom() {
		this.letovi = new ArrayList<Let>();
	}
	public void dodajLet(Let l) {
		letovi.add(l);
	}
	public void ispisiSveLetove() {
		for(Let l : letovi) {
			System.out.println(l);
		}
	}
	public void ispisiUkupneTroskove() {
		double ukupniTroskovi=0;
		
		for(Let l : letovi) {
			ukupniTroskovi += l.izracunajTroskove();
		}
		System.out.println(ukupniTroskovi);
	}
}
