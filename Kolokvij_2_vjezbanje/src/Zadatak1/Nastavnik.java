package Zadatak1;

public class Nastavnik extends Osoba {
	private String predmet;
	
	public Nastavnik(int ID, String imePrezime, String predmet) {
		super(ID, imePrezime);
		this.predmet = predmet;
	}
	public String getPredmet() {
		return this.predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	@Override
	public String toString() {
		return super.toString()+ "Predmet "+predmet+".";
	}
}
