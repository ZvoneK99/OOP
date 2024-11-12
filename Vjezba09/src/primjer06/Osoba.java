package primjer06;

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
	public void jeLiPunoljetna() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int starost = trenutnaGodina - datumRođenja.godina;
		if(starost>18) {
			System.out.println("Osoba je punoljetna.");
		}
		else {
			System.out.println("Osoba nije punoljetna.");
		}
	}
	public Datum getDatumRođenja() {
	    return datumRođenja;
	}
	@Override
	public String toString() {
		return "Ime: "+ime+" Prezime: "+prezime+", Datum rođenja: "+datumRođenja+".";
	}
}
