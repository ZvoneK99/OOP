package ZadatakFaks;

import java.time.LocalDate;
import java.util.ArrayList;

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
	public Datum getDatumRođenja() {
		return this.datumRođenja;
	}
	//metoda za punoljetnost
	public boolean jeLiPunoljetna() {
		int trenutnaGodina = LocalDate.now().getYear();
		int starost = trenutnaGodina - datumRođenja.godina;
		LocalDate datumRodjenja = LocalDate.of(datumRođenja.godina, datumRođenja.mjesec, datumRođenja.dan);
		if(datumRodjenja.isAfter(LocalDate.now().withYear(datumRodjenja.getYear()))) {
			starost--;
		}
		return starost >=18;
	}
	
	public void ispisiDetalje() {
		String punoljetnost = jeLiPunoljetna() ? "punoljetna" : "maloljetna";
		System.out.println("Ime i prezime: "+ime+" "+prezime+", Datum rođenja: "+datumRođenja+", a osoba je "+punoljetnost+".");
	}
}
