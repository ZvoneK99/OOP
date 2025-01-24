package Zadatak1;

public abstract class Natjecatelj implements Prijava {
	int brojKilometara;
	private String imePrezime;
	
	public Natjecatelj(int brojKilometara, String imePrezime) {
		this.brojKilometara = brojKilometara;
		this.setImePrezime(imePrezime);
	}
	public Natjecatelj(Natjecatelj original) {
		this.brojKilometara = original.brojKilometara;
		this.imePrezime = original.imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public void trening(int noviKilometri) {
		brojKilometara+= noviKilometri;
	}
	@Override
	public String toString() {
		return "Ime prezime: "+getImePrezime()+" Broj pređenih kilometara: "+brojKilometara;
	}
	
}
