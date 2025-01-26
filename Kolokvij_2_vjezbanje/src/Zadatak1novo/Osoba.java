package Zadatak1novo;

public abstract class Osoba {
	private int ID;
	private String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.setID(ID);
		this.setImePrezime(imePrezime);
	}
	
	public abstract double dohvatiOcjenu();
	
	public final boolean jeLiIZvanredan() {
		return dohvatiOcjenu() >4.5;
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
		return "ID "+getID()+" Ime i prezime: "+getImePrezime()+" Ocjena "+dohvatiOcjenu();
 	}
}
