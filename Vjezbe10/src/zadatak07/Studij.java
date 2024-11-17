package zadatak07;

import java.util.ArrayList;

public class Studij {
	String naziv;
	ArrayList<Predmet> predmeti;
	
	public Studij(String naziv) {
		this.naziv = naziv;
		this.predmeti = new ArrayList<>();
	}
	public void dodajPredmet(Predmet predmet) {
		predmeti.add(predmet);
	}
	public void ispisiPredmete() {
		System.out.println("Predmeti na studiju: "+naziv+".");
		for(Predmet p : predmeti) {
			System.out.println("-"+p.nazivPredmeta);
		}
	}
}
