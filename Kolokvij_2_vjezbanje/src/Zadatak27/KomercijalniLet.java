package Zadatak27;

public class KomercijalniLet extends OsnovniLet{
	String klasaLeta;
	
	public KomercijalniLet(String brojLeta, int brojPutnika, double cijenaPoPutniku, String klasaLeta) {
		super(brojLeta, brojPutnika, cijenaPoPutniku);
		this.klasaLeta = klasaLeta;
	}

	@Override
	public void dodatneUsluge() {
		System.out.println("Ispis poruke o jelu");
	}
	
	
}
