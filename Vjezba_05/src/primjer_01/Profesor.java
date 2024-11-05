package primjer_01;

import java.util.ArrayList;

public class Profesor extends Osoba {
	String titula;
	ArrayList<String> predmeti = new ArrayList<String>();
	
	public Profesor(String ime, String prezime, int godinaRođenja, String titula) {
		super(ime, prezime, godinaRođenja);
		this.titula = titula;
	}
	
	
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Godina rođenja: "+godinaRođenja);
		System.out.println("Titule: "+titula);
		System.out.println("Predmeti koje predaje: "+predmeti);
	}
}
