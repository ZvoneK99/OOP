package primjer03;

import java.util.ArrayList;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRodjenja;	//Preko ovoga pristupamo metodama iz Datum.java
	Studij studij;
	ArrayList<Predmet> predmeti;
	public Osoba(String ime, String prezime, Datum datumRodjenja, Studij studij) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.studij = studij;
		this.predmeti = new ArrayList<>();
	}
	//Dodavanje predmeta u listu predmeti
	public void dodajPredmet(Predmet predmet) {
		predmeti.add(predmet);
	}
	//Metoda za ispis detalja
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+", godina rođenja: "+datumRodjenja+".");
		if(datumRodjenja.jePunoljetan()) {
			System.out.println("Osoba je punoljetna.");
		}
		else {
			System.out.println("Osoba nije punoljetna");
		}
		System.out.println("Naziv studija: "+studij.toString());
		System.out.println("Predmeti: ");
		
			if(predmeti.isEmpty()) {
				System.out.println("Nema dodanih predemta.");
			}
			else {
				for(Predmet p : predmeti) {
					System.out.println(p+",");
			}
		}
	}
}
