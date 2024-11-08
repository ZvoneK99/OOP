package primjer03;

import java.util.ArrayList;

public class Student {
	String ime;
	String prezime;
	ArrayList<Integer> ocjene;
	
	public Student(String ime, String prezime, 	ArrayList<Integer> ocjene) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocjene = ocjene;
	}
	public void prosjekOcjena() {
		double zbroj = 0;
		for(int i=0; i<ocjene.size(); i++) {
			zbroj+=ocjene.get(i);
		}
		double prosjek = zbroj/ocjene.size();
		System.out.println("Prosjek ocjena za "+ime+" je: " +prosjek);

	}
}
