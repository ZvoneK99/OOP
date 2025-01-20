package Zadatak5;

public abstract class Osoba {
	private int ID;
	private String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.setID(ID);
		this.setImePrezime(imePrezime);
	}
	abstract double dohvatiPlacu();
	
	public final boolean jeLiVisokaPlaca() {
		if(dohvatiPlacu() > 10000) {
			return true;
		}
		else {
			return false;
		}
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
	@Override
	public String toString() {
		return "ID: "+getID()+" Ime Prezime "+getImePrezime();
		}
}
