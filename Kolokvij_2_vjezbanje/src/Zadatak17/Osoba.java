package Zadatak17;

public abstract class Osoba {
	private int ID;
	private String imePrezime;
	
	public Osoba(int ID, String imePrezime) {
		this.setID(ID);
		this.setImePrezime(imePrezime);
	}
	//Getteri i setteri
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
		
	public void prikaziDetalje() {
		StringBuilder sb = new StringBuilder();
		 sb.append("ID").append(ID).append("Ime prezime").append(imePrezime);
		 System.out.println(sb);
	}
}
