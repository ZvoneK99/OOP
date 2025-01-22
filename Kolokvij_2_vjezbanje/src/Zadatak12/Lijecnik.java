package Zadatak12;

public class Lijecnik extends Zaposlenik {
	private String specijalizacija;
	private int brojPacijenata;
	
	public Lijecnik(String ime, int godine, double placa, String specijalizacija, int brojPacijenata) {
		super(ime, godine, placa);
		this.setSpecijalizacija(specijalizacija);
		this.brojPacijenata = brojPacijenata;
	}

	public String getSpecijalizacija() {
		return specijalizacija;
	}

	public void setSpecijalizacija(String specijalizacija) {
		this.specijalizacija = specijalizacija;
	}
	public int getBrojPacijenata() {
		return brojPacijenata;
	}
	public void setBrojPacijenata(int brojPacijenata) {
		this.brojPacijenata = brojPacijenata;
	}
	
	public double izracunajPlacu() {
		return getPlaca() + (500 * brojPacijenata);
	}

}
