package primjer11;

public class Osoba {
	String ime;
	String prezime;
	int datumRođenja;
	
	public Osoba(String ime, String prezime, int datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	public void ispisiDetalje() {
		System.out.println("Ime i prezime "+ime+" "+prezime+" datum rođenja: "+datumRođenja);
	}
}
