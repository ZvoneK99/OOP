package Zadatak20;

public abstract class Zaposlenik implements Osoba, PlaceniRadnik{
	private String ime;
	private String prezime;
	private int godinaZaposlenja;
	
	public Zaposlenik(String ime, String prezime, int godinaZaposlenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaZaposlenja = godinaZaposlenja;
	}
	
	//Getter i setter
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
	public int getGodinaZaposlenja() {
		return godinaZaposlenja;
	}
	public void setGodinaZaposlenja(int godinaZaposlenja) {
		this.godinaZaposlenja = godinaZaposlenja;
	}
	
	public int getStaz() {
		return 2023-getGodinaZaposlenja();
	}
	@Override
	public String vrstaOsobe() {
		return "Zaposlenik";
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vrsta osobe").append(vrstaOsobe()).append(" Ime ").append(getIme()).append(" Prezime ").append(getPrezime()).append(" Godina zaposlenja ").append(getGodinaZaposlenja())
		.append(" Staz ").append(getStaz());
		return sb.toString();
	}
}
