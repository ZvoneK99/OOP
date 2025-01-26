package Zadatak22;

import java.util.ArrayList;

public class ZracnaLuka {
	private ArrayList<Let> letovi;
	
	public ZracnaLuka() {
		this.setLetovi(new ArrayList<Let>());
	}

	public ArrayList<Let> getLetovi() {
		return letovi;
	}

	public void setLetovi(ArrayList<Let> letovi) {
		this.letovi = letovi;
	}
	public void dodajLet(Let l) {
		
		letovi.add(l);
		System.out.println("Let "+l.toString()+" je dodan u zracnu luku");
	}
	public void ispisiLetove() {
		for(Let l : letovi) {
			System.out.println(l.toString());
		}
	}
	public void prikaziNajskupljiLet() {
		Let najskuplji = letovi.get(0);
		for(Let l : letovi) {
			if(l.izracunajTroskove() > najskuplji.izracunajTroskove()) {
				najskuplji = l;
			}
		}
		System.out.println("Najskuplji let je");
		System.out.println(najskuplji.toString());
	}
}
