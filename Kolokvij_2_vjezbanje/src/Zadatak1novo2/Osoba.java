package Zadatak1novo2;

public abstract class Osoba {
	private int ID;
	private String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.setID(ID);
		this.setImePrezime(imePrezime);
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

	public abstract double dohvatiOcjenu();
	
	public final boolean jeLiIzvanredan() {
		return dohvatiOcjenu() > 4.5;
	}
	@Override
    public String toString() {
        return "ID: " + ID + ", Ime i prezime: " + imePrezime;
    }
}
