package Zadatak1novo2;

public class Nastavnik extends Osoba {
	private String predmet;
	private double ocjenaNastavnika;
	
	
	public Nastavnik(int ID, String imePrezime, String predmet, double ocjenaNastavnika) {
		super(ID, imePrezime);
		this.predmet = predmet;
		this.ocjenaNastavnika = ocjenaNastavnika;
	}
	
	
	@Override
	public double dohvatiOcjenu() {
		return ocjenaNastavnika;
	}


	public String getPredmet() {
		return predmet;
	}


	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}


	public double getOcjenaNastavnika() {
		return ocjenaNastavnika;
	}


	public void setOcjenaNastavnika(double ocjenaNastavnika) {
		this.ocjenaNastavnika = ocjenaNastavnika;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("Predmet ").append(predmet).append("Ocjena nastavnika ").append(ocjenaNastavnika);
		return sb.toString();
	}
}
