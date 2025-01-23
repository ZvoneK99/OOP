package Zadatak14;

public class Nastavnik extends Osoba{
	private String predmet;
	private int brojZavrsenihProjekata;
	private double ocjenaNastavnika;
	
	public Nastavnik(int ID, String imePrezime, String predmet, int brojZavrsenihProjekata, double ocjenaNastavnika) {
		super(ID, imePrezime);
		this.brojZavrsenihProjekata = brojZavrsenihProjekata;
		this.ocjenaNastavnika = ocjenaNastavnika;
	}
	
	@Override
	public double izracunajRezultat() {
		return ocjenaNastavnika * brojZavrsenihProjekata;
	}
	//Getteri i setteri
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public int getBrojZavrsenihProjekata() {
		return this.brojZavrsenihProjekata;
	}
	public void setBrojZavrsenihProjekata(int brojZavrsenihProjekata) {
		this.brojZavrsenihProjekata = brojZavrsenihProjekata;
	}
	public double getOcjenaNastavnika() {
		return this.ocjenaNastavnika;
	}
	public void setOcjenaNastavnika(double ocjenaNastavnika) {
		this.ocjenaNastavnika = ocjenaNastavnika;
	}

	@Override
	public String IspisiIzvjestaj() {
		StringBuilder sb = new StringBuilder();
	    sb.append(super.toString())
	      .append(", Predmet: ").append(getPredmet())
	      .append(", Broj završenih projekata: ").append(getBrojZavrsenihProjekata())
	      .append(", Ocjena nastavnika: ").append(getOcjenaNastavnika());
	    return sb.toString();
	}

}
