package Zadatak12;

public class Pacijent implements Osoba {
	private String ime;
	private int godine;
	private int brojKartona;
	private Lijecnik lijecnik;
	
	public Pacijent(String ime, int godine, int brojKartona, Lijecnik lijecnik) {
		this.ime = ime;
		this.godine = godine;
		this.brojKartona = brojKartona;
		this.lijecnik = lijecnik;
	}
	
	@Override	
	public String dohvatiIme() {
		return ime;
	}

	@Override
	public int dohvatiGodine() {
		return godine;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public int getBrojKartona() {
		return brojKartona;
	}

	public void setBrojKartona(int brojKartona) {
		this.brojKartona = brojKartona;
	}

	public Lijecnik getLijecnik() {
		return lijecnik;
	}

	public void setLijecnik(Lijecnik lijecnik) {
		this.lijecnik = lijecnik;
	}
	public String dohvatiDetalje() {
		return "Ime "+getIme()+" Godine: "+getGodine()+" Broj kartona: "+getBrojKartona()+" Lijecnik "+getLijecnik(); 
	}
}
