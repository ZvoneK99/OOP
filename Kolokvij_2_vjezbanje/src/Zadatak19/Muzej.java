package Zadatak19;

import java.util.ArrayList;

public class Muzej {
	private ArrayList<Eksponat> eksponati;
	
	public Muzej() {
		this.eksponati = new ArrayList<Eksponat>();
	}
	
	public void dodajEksponat(Eksponat e) {
		eksponati.add(e);
	}
	
	public void ispisiEksponate() {
		for(Eksponat e : eksponati) {
			System.out.println(e.toString());
		}
	}
	public void fultrirajEksponate(String vrsta) {
		for(Eksponat e : eksponati) {
			if(e.vrstaEksponata().equalsIgnoreCase(vrsta)) {
				System.out.println(e.toString());
			}
		}
	}
	public void najskupljiEksponat() {
		Eksponat najskuplji = eksponati.get(0);
		for(Eksponat e : eksponati) {
			if(e.vrijednostEksponata() > najskuplji.vrijednostEksponata()) {
				najskuplji = e;
			}
		}
		System.out.println(najskuplji.toString());
	}
}
