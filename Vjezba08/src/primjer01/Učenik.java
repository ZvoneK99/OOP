package primjer01;

import java.util.ArrayList;

public class Učenik {
	String ime;
	String prezime;
	ArrayList<Integer> ocjene;
	
	public Učenik(String ime, String prezime, ArrayList<Integer> ocjene) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocjene = new ArrayList<>(ocjene);
	}
	public void dodajOcjenu(int ocjena) {
		ocjene.add(ocjena);
	}
	public double prosjekOcjena() {
		int zbroj=0;
		for(int i=0; i<ocjene.size(); i++) {
			zbroj+=ocjene.get(i);
		}
		return (double)zbroj/ocjene.size();
		}
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Ocjene učenika su: "+ocjene);
	}
}
