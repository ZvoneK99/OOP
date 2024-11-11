package zad01;

import java.util.ArrayList;
import java.util.Calendar;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	Studij studij;
	ArrayList<Predmet> predmeti;
	
	public Osoba(String ime, String prezime, Datum datumRođenja, Studij studij) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
		this.studij = studij;
		this.predmeti = new ArrayList<>();
	}
	public void ispisiPodatkeURedu() {
		System.out.println("Ime: "+ime+" "+prezime+", "+datumRođenja.ispisiDatum());
	}
	public void jeLiPunoljetna() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int starost = trenutnaGodina-this.datumRođenja.godina;
		
		if(starost>18) {
			System.out.println("Osoba je punoljetna");
		}
		else {
			System.out.println("Osoba nije punoljetna.");
		}
	}
	public void ispisiPodatke() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Datum rođenja: "+datumRođenja.ispisiDatum());
	}
}
