package Zadatak16;

public class Kuca extends OsnovnaNekretnina {
	int brojKatova;
	boolean imaDvoriste;
	
	public Kuca(String adresa, double povrsina, double cijenaPoKvadratu, int brojKatova, boolean imaDvoriste) {
		super(adresa, povrsina, cijenaPoKvadratu);
		this.brojKatova = brojKatova;
		this.imaDvoriste = false;
	}
	@Override
	public String vrstaNekretnine() {
		return "Kuca";
	}
	
	@Override
	public String toString() {
		String stanje = imaDvoriste ? "Da" : "Ne";
		return super.toString() + "Broj katova "+brojKatova+" Dvoriste? "+stanje;
	}
}
