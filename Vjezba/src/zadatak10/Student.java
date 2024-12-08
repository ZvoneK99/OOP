package zadatak10;

import java.util.ArrayList;

public class Student {
	String ime;
	String prezime;
	int brojOcjena;
	ArrayList<Integer> ocjene;
	
	public Student(String ime, String prezime, int brojOcjena, ArrayList<Integer>ocjene) {
		this.ime = ime;
		this.prezime = prezime; 
		this.brojOcjena = brojOcjena;
		this.ocjene = new ArrayList<>();
	}
	public double izracunajProsjek() {
		return brojOcjena/ ocjene.size();
	}
	
}
