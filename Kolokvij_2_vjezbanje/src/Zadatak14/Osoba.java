package Zadatak14;

public abstract class Osoba implements Izvjestaj{
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
	public abstract double izracunajRezultat();
	
	public final boolean jeLiIzvanredan() {
		return izracunajRezultat() > 90;
	}
	public String ispisiIzvjestaj() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("ID: ").append(getID())
	      .append(", Ime prezime: ").append(getImePrezime())
	      .append(", Izvanredan? ").append(jeLiIzvanredan());
	    return sb.toString();
	}

	
		
}
