package Zadatak16;

public class LuksuznaNekretnina extends Stan {
	double dodatnaCijena;
	
	public LuksuznaNekretnina(String adresa, double povrsina, double cijenaPoKvadratu, int brojSoba, double dodatnaCijena) {
		super(adresa, povrsina, cijenaPoKvadratu, brojSoba);
		this.dodatnaCijena = dodatnaCijena;
	}
	@Override
	public String vrstaNekretnine() {
		return "Luksuzna nekretnina";
	}
	@Override
	public double izracunajCijenu() {
		return super.izracunajCijenu() + dodatnaCijena;
	}
}
