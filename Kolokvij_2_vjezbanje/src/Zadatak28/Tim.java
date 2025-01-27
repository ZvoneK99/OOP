package Zadatak28;

import java.util.ArrayList;

public class Tim {
	String naziv;
	Radnik voditelj;
	ArrayList<Radnik> clanovi;
	
	public Tim(String naziv, Radnik voditelj) {
		this.naziv = naziv;
		this.voditelj = voditelj;
		this.clanovi = new ArrayList<Radnik>();
	}
	
	public void dodajClana(Radnik clan) {
		clanovi.add(clan);
	}
	public double izracunajUkupnuPlacu() {
		double ukupno = 0;
		for(Radnik r : clanovi) {
			ukupno += r.izracunajPlacu();
		}
		return ukupno;
	}	
	@Override
	public String toString() {
	    String rezultat = "Naziv: " + naziv + ", Voditelj: " + voditelj.imePrezime + ", Članovi:\n";

	    for (Radnik r : clanovi) {
	        rezultat += r.toString() + "\n"; // Poziva toString() iz razreda Radnik
	    }

	    return rezultat;
	}

}
