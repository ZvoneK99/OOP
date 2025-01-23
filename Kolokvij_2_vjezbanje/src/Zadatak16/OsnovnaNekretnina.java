package Zadatak16;

public abstract class OsnovnaNekretnina implements Nekretnina {
	String adresa;
	double povrsina;
	double cijenaPoKvadratu;
	
	public OsnovnaNekretnina(String adresa, double povrsina, double cijenaPoKvadratu) {
		this.adresa = adresa;
		this.povrsina = povrsina;
		this.cijenaPoKvadratu = cijenaPoKvadratu;
	}
	
	
	@Override
	public double izracunajCijenu() {
		return povrsina * cijenaPoKvadratu;
	}

	@Override
	public String vrstaNekretnine() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Adresa "+adresa+" Povrsina: "+povrsina+" Cijena po kvadratu "+cijenaPoKvadratu;
	}

}
