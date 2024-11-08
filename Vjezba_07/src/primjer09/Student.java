package primjer09;

import java.util.ArrayList;

public class Student {
	String ime;
	String prezime;
	int brojIndeksa;
	ArrayList<Predmet> predmeti;
	
	public Student(String ime, String prezime, int brojIndeksa) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.predmeti = new ArrayList<>();
	}
	public void dodajPredmet(Predmet predmet) {
		System.out.println("-----------------------------");
		predmeti.add(predmet);
		System.out.println("Predmet "+predmet+" je dodan na listu predmeta.");
	}
	public int ukupnoECTSBodova() {
		int ukupnoECTS = 0;
		System.out.println("-----------------------------");

		System.out.println("Ukupan broj ects bodova koje student ima je:");
		for(Predmet p : predmeti)  {
			ukupnoECTS+=p.ectsBodovi;
		}
		System.out.println(ukupnoECTS);
		System.out.println("-----------------------------");
		return ukupnoECTS;
	}
	public void ispisiDetalje() {
		System.out.println("-----------------------------");
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Broj indeksa"+brojIndeksa);
		System.out.println("Predmeti koje student sluša:");
		for(Predmet p : predmeti) {
			p.ispisiDetalje();
		}
	}
}
