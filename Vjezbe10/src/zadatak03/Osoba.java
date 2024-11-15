package zadatak03;

public class Osoba {
	private String ime;
	private String prezime;
	private Datum datumRođenja;
	
	public Osoba(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	
	//Getteri za ime,prezime,datumRođenja
	public String getIme() {
		return this.ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	public Datum getDatumRođenja() {
		return this.datumRođenja; 
	}
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+", datum rođenja: "+datumRođenja);
	}
}
