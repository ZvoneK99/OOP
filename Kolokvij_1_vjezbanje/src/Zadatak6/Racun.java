package Zadatak6;

public class Racun {
	private String brojRacuna;
	private double stanje;
	
	public Racun(String brojRacuna, double stanje) {
		this.setBrojRacuna(brojRacuna);
		this.setStanje(stanje);
	}
	public void uplati(double iznos) {
		if(iznos>0) {
			stanje+=iznos;
		}
		else {
			System.out.println("Ne mozete uplatiti taj iznos");
		}
	}
	void isplati(double iznos) {
		if(stanje>=iznos) {
			stanje-=iznos;
		}
		else {
			System.out.println("Stanje na racunu nije dovoljno");
		}
	}
	

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}
	@Override
	public String toString() {
		return "Broj racuna "+brojRacuna+", stanje "+stanje; 
	}
}
