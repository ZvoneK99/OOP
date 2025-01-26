package Zadatak22;

public class Pilot extends Osoba {
	private int satiLeta;
	
	public Pilot(String ime, String prezime, int satiLeta) {
		super(ime, prezime);
		this.setSatiLeta(satiLeta);
	}

	@Override
	public String uloga() {
		return "Pilot";
	}

	public int getSatiLeta() {
		return satiLeta;
	}

	public void setSatiLeta(int satiLeta) {
		this.satiLeta = satiLeta;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Sati leta ").append(getSatiLeta());
		return sb.toString();
	}
}
