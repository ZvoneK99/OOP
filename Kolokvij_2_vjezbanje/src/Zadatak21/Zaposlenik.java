package Zadatak21;

public abstract class Zaposlenik {
	private int ID;
	private String imePrezime;
	private int godineIskustva;
	
	public Zaposlenik(int ID, String imePrezime, int godineIskustva) {
		this.setID(ID);
		this.setImePrezime(imePrezime);
		this.setGodineIskustva(godineIskustva);
	}
	
	public abstract double izracunajBodove();
	
	public final boolean jeLiSenior() {
		return godineIskustva >= 5;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public int getGodineIskustva() {
		return godineIskustva;
	}
	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}
	@Override
	public String toString() {
		return "ID "+getID()+" Ime Prezime "+getImePrezime()+" Godine iskustva "+getGodineIskustva()+" Senior: "+jeLiSenior()+" Bodovi "+izracunajBodove();
	}

	public abstract void prikaziUcinak();
}
