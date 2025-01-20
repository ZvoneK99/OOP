package Zadatak5;

public class Radnik extends Osoba {
	private int radniSati;
	private double satnica;
	
	public Radnik(int ID, String imePrezime, int radniSati, double satnica) {
		super(ID, imePrezime);
		this.setRadniSati(radniSati);
		this.setSatnica(satnica);
	}
	
	
	@Override
	double dohvatiPlacu() {
		return radniSati * satnica;
	}


	public int getRadniSati() {
		return radniSati;
	}


	public void setRadniSati(int radniSati) {
		this.radniSati = radniSati;
	}


	public double getSatnica() {
		return satnica;
	}


	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}
	@Override
	public String toString() {
		return super.toString()+" Radni sati "+getRadniSati()+" Satnica "+getSatnica();
	}
}
