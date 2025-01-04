package ZSR2ZAD2;

public class Osoba {
	String ime;
	String prezime;
	String datumRodjenja;
	
	public Osoba(String ime, String prezime, String datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	public String toString() {
		return "Ime "+ime+" "+prezime+"--> Datum rođenja <"+datumRodjenja+">.";
	}
}	
