package primjer05;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	
	public Osoba(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	public void ispisiDetaljeOsoba() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Datum rođenja: "+datumRođenja);
	}
}
