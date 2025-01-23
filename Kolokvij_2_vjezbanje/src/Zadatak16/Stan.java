package Zadatak16;

public class Stan extends OsnovnaNekretnina {
	int brojSoba;
	
	public Stan(String adresa, double povrsina, double cijenaPoKvadratu, int brojSoba) {
		super(adresa, povrsina, cijenaPoKvadratu);
		this.brojSoba = brojSoba;
	}
	@Override
	public String vrstaNekretnine() {
		return "Stan";
	}
	
	@Override
	public String toString() {
		return super.toString() + "Broj soba "+brojSoba;
	}

}
