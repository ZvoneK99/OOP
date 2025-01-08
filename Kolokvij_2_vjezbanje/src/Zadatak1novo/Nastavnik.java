package Zadatak1novo;

public class Nastavnik extends Osoba {
	private String predmet;
	private double ocjenaNastavnika;
	
	public Nastavnik(int ID, String imePrezime, String predmet, double ocjenaNastavnika) {
		super(ID, imePrezime);
		this.setPredmet(predmet);
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
		return super.toString()+" Predmet: "+getPredmet()+" Ocjena nastavnika: "+getOcjenaNastavnika();
	}
}
