package Zadatak1;

public class Osoba {
	private int ID;
	private String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.ID = ID;
		this.imePrezime = imePrezime;
	}
	
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getImePrezime() {
		return this.imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public String toString() {
		return "ID "+ID+" Ime Prezime "+imePrezime+".";
	}
}
