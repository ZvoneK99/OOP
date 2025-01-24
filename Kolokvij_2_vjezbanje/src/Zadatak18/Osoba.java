package Zadatak18;

public abstract class Osoba {
	int ID;
	String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.ID = ID;
		this.imePrezime = imePrezime;
	}
	public Osoba(Osoba o) {
		this.ID = o.ID;
		this.imePrezime = o.imePrezime;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ID ").append(ID).append(" Ime prezime ").append(imePrezime);
		return sb.toString();
	}
}
