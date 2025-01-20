package Zadatak7;

public class Radnik extends Zaposlenik {
	private int brojSati;
	
	public Radnik(String ime, int godine, double osnovnaPlaca, int brojSati) {
		super(ime, godine, osnovnaPlaca);
		this.setBrojSati(brojSati);
	}

	public int getBrojSati() {
		return brojSati;
	}

	public void setBrojSati(int brojSati) {
		this.brojSati = brojSati;
	}
	@Override
	public String dohvatiIme() {
		return getIme();
	}
	@Override
	public int dohvatiGodine() {
		return getGodine();
	}
	@Override
	public double izracunajPlacu() {
		return brojSati * 10;
	}
	@Override 
	public String toString() {
		return super.toString()+" Broj sati: "+getBrojSati();
	}
 
}
