package Zadatak22;

public abstract class Osoba {
	private String ime;
	private String prezime;
	
	public Osoba(String ime, String prezime) {
		this.setIme(ime);
		this.setPrezime(prezime);
	}
	public abstract String uloga();
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime ").append(getIme()).append(" Prezime ").append(getPrezime()).append(" Uloga: ").append(uloga());
		return sb.toString();
	}
	
}
