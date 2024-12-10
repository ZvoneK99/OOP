package K2Z1;

public class Nastavnik extends Osoba {
	private String predmet;
	private double ocjenaNastavnika;
	
	public Nastavnik(int ID, String imePrezime, String predmet, double ocjenaNastavnika) {
		super(ID, imePrezime);
		this.setPredmet(predmet);
		this.setOcjenaNastavnika(ocjenaNastavnika);
	}
	//Getteri i setteri
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
	public double dohvatiOcjenu() {
		return Math.round(getOcjenaNastavnika()*100)/100;
	}
	@Override
	public String toString() {
		return super.toString()+ "Predmet: "+predmet+", Ocjena nastavnika: "+ocjenaNastavnika+".";
	}
}
