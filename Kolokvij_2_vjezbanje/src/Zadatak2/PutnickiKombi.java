package Zadatak2;

public class PutnickiKombi extends Kombi {
	private int brojPutnika;
	
public PutnickiKombi(String modelVozila, String registracijaVozila, double visinaKombija, double duzinaKombija, int brojPutnika) {
	super(modelVozila, registracijaVozila, visinaKombija, duzinaKombija);
	this.brojPutnika = brojPutnika;
}
	public int getBrojPutnika() {
		return brojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	@Override
	public int dohvatiMaksimalanBrojPutnika() {
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Broj putnika "+getBrojPutnika();
	}
}
