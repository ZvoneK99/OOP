package Zadatak27;

public abstract class OsnovniLet implements Let{
	String brojLeta;
	int brojPutnika;
	double cijenaPoPutniku;
	
	public OsnovniLet(String brojLeta, int brojPutnika, double cijenaPoPutniku) {
		this.brojLeta = brojLeta;
		this.brojPutnika = brojPutnika;
		this.cijenaPoPutniku = cijenaPoPutniku;
	}
	@Override
	public double izracunajTroskove() {
		return brojPutnika * cijenaPoPutniku;
	}
	@Override
	public void zapocniLet() {
		System.out.println("Let zapocinje");
	}
	public abstract void dodatneUsluge();
}
