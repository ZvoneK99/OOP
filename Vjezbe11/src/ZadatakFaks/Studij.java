package ZadatakFaks;

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
}
