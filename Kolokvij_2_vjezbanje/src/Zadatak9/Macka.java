package Zadatak9;

public class Macka extends Zivotinja {
	private int brojMiševaUlovljeni;
	private double  tezinaMacke;
	
	public Macka(int ID, String vrsta, int brojMiševaUlovljeni, double tezinaMacke) {
		super(ID, vrsta);
		this.setBrojMiševaUlovljeni(brojMiševaUlovljeni);
		this.setTezinaMacke(tezinaMacke);
	}
	@Override
	public double dohvatiTezinu() {
		return tezinaMacke;
	}
	public int getBrojMiševaUlovljeni() {
		return brojMiševaUlovljeni;
	}
	public void setBrojMiševaUlovljeni(int brojMiševaUlovljeni) {
		this.brojMiševaUlovljeni = brojMiševaUlovljeni;
	}
	public double getTezinaMacke() {
		return tezinaMacke;
	}
	public void setTezinaMacke(double tezinaMacke) {
		this.tezinaMacke = tezinaMacke;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj ulovljenih miševa: "+getBrojMiševaUlovljeni()+" Tezina mačke: "+dohvatiTezinu();
	}
}
