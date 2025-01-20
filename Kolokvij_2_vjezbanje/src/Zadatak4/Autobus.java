package Zadatak4;

public class Autobus extends OsnovnoVozilo {
	private int brojSjedala;
	private boolean prijevozPutnika;
	
	public Autobus(String naziv, int brojSjedala, boolean prijevozPutnika) {
		super(naziv);
		this.setBrojSjedala(brojSjedala);
		this.setPrijevozPutnika(prijevozPutnika);
	}

	public int getBrojSjedala() {
		return brojSjedala;
	}

	public void setBrojSjedala(int brojSjedala) {
		this.brojSjedala = brojSjedala;
	}

	public boolean isPrijevozPutnika() {
		return prijevozPutnika;
	}

	public void setPrijevozPutnika(boolean prijevozPutnika) {
		this.prijevozPutnika = prijevozPutnika;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj sjedala "+getBrojSjedala()+" Prijevoz putnika: "+isPrijevozPutnika();
	}
}
