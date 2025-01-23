package Zadatak16;

public class PoslovniProstor extends OsnovnaNekretnina {
	String namjena;
	
	public PoslovniProstor(String adresa, double povrsina, double cijenaPoKvadratu, String namjena) {
		super(adresa, povrsina, cijenaPoKvadratu);
		this.namjena = namjena;
	}
	@Override
	public String vrstaNekretnine() {
		return "Poslovni prostor";
	}
	
	@Override
	public String toString() {
		return super.toString()+" Namjena: "+namjena;
	}
	
}
