package primjer08;

import java.util.ArrayList;

public class Skladiste {
	ArrayList<Proizvod> proizvodi;
	
	public Skladiste() {
		this.proizvodi = new ArrayList<>();
	}
	public void dodajProizvod(Proizvod proizvod) {
		proizvodi.add(proizvod);
	}
	public void prikaziSveProizvode() {
		System.out.println("-----------------");
		System.out.println("Proizvodi u skladištu su: "+proizvodi);
		System.out.println("-----------------");
	}
	public void prikaziProizvodeIzKategorije(String kategorija) {
		boolean pronađen = false;
		System.out.println("Proizvodi iz te kategorije su: ");

		for(Proizvod p : proizvodi) {
			if(p.kategorija.equals(kategorija)) {
				System.out.println(p.naziv);
				pronađen = true;
			}
		}
		if(!pronađen) {
			System.out.println("Nema proizvoda u toj kategoriji.");
		}
	}
	public void pronadiProizvodPoNazivu(String naziv) {
		boolean pronaden = false;
		for(Proizvod p : proizvodi) {
			if(p.naziv.equals(naziv)) {
				System.out.print("Proizvod je pronađen.");
				pronaden = true;
			}
		}
		if(!pronaden) {
			System.out.println("Proizvod nije pronađen");
		}
	}
}
