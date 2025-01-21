package Zadatak10;

public class Autobus extends TransportnoSredstvo {
	private int brojPutnika;
	private double tezinaPutnika;
	
	public Autobus(int ID, String naziv, int brojPutnika, double tezinaPutnika) {
		super(ID, naziv);
		this.setBrojPutnika(brojPutnika);
		this.setTezinaPutnika(tezinaPutnika);
	}
	@Override
	public double izracunajUkupnuTezinu() {
		return tezinaPutnika * brojPutnika;
	}
	public int getBrojPutnika() {
		return brojPutnika;
	}
	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	public double getTezinaPutnika() {
		return tezinaPutnika;
	}
	public void setTezinaPutnika(double tezinaPutnika) {
		this.tezinaPutnika = tezinaPutnika;
	}
	@Override
	public String toString() {
		return super.toString()+ " Broj putnika: "+getBrojPutnika()+" Tezina putnika: "+getTezinaPutnika();
	}
}
