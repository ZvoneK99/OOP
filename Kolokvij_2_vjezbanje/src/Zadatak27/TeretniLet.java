package Zadatak27;

public class TeretniLet extends OsnovniLet{
	double nosivost;
	double cijenaPoToni;
	
	public TeretniLet(String brojLeta, int brojPutnika, double cijenaPoPutniku, double nosivost, double cijenaPoToni) {
		super(brojLeta, brojPutnika, cijenaPoPutniku);
		this.nosivost = nosivost;
		this.cijenaPoToni = cijenaPoToni;
	}
	@Override
	public void dodatneUsluge() {
		System.out.println("Ispis poruke o teretnim uslugama");
	}
	@Override
	public double izracunajTroskove() {
		return nosivost * cijenaPoToni;
	}
	
}
