package zadatak08;

import java.util.ArrayList;
import java.util.Calendar;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	Studij studij;
	ArrayList<Predmet> predmeti;
	
	public Osoba(String ime, String prezime, Datum datumRođenja, Studij studij, ArrayList<Predmet> predmeti) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
		this.studij = studij;
		this.predmeti = new ArrayList<>();
	}
	public boolean jeLiPunoljetna() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int starost = trenutnaGodina-datumRođenja.godina;
		
		if(starost>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	public void ispisiDetalje() {
		String stanje = jeLiPunoljetna() ? "punoljetna" : "maloljetna";
		System.out.println("Ime i prezime: "+ime+" "+prezime+", Datum rođenja: "+datumRođenja+", Osoba je: "+stanje+".");
		 System.out.println("Studij: " + studij.naziv);
		    System.out.println("Predmeti: ");
		    for (Predmet predmet : predmeti) {
		        System.out.println(" - " + predmet.nazivPredmeta);
		    }
	}
	public void ispisiImePrezime() {
		System.out.println(ime+" "+prezime);
	}
}
