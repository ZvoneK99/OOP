package zadatak07;

import java.util.ArrayList;
import java.util.Calendar;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	
	public Osoba(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	public Datum getDatumRođenja() {
	    return datumRođenja;
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
	}
	public void ispisiImePrezime() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+".");
	}
}
