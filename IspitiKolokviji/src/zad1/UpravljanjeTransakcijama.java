package zad1;

import java.time.LocalDate;
import java.util.ArrayList;

public class UpravljanjeTransakcijama {
	ArrayList<Transakcija> transakcije;
	
	public UpravljanjeTransakcijama() {
		this.transakcije = new ArrayList<>();
	}
	
	//Metoda za dodavanje transakcije
	public void dodajTransakciju(Transakcija t) {
		transakcije.add(t);
	}
	//Pretrazivanje po datumu
	public void pretraziPoDatumu(LocalDate datum) {
		for(Transakcija t : transakcije) {
			if(t.getDatum().equals(datum)) {
				System.out.println(t);
			}
		}
	}
	//Ispis svih transakcija
	public void ispisiSveTransakcije() {
		for(Transakcija t : transakcije) {
			System.out.println(t);
		}
	}
}
