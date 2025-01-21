package Zadatak8;

public abstract class Student implements Osoba {
	private String ime;
	private int godine;
	private double prosjekOcjena;
	
	public Student(String ime, int godine, double prosjekOcjena) {
		this.ime = ime;
		this.godine = godine;
		this.prosjekOcjena = prosjekOcjena;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public double getProsjekOcjena() {
		return prosjekOcjena;
	}
	public void setProsjekOcjena(double prosjekOcjena) {
		this.prosjekOcjena = prosjekOcjena;
	}
	
	public abstract int polozeniECTS();
	
	@Override
	public String dohvatiIme() {
		return getIme();
	}

	@Override
	public int dohvatiGodine() {
		return getGodine();
	}
	@Override
	public String toString() {
		return "Ime: "+getIme()+" Godine: "+getGodine()+" Prosjek ocjena : "+getProsjekOcjena();
	}
}
