package Zad2;

public class OsobnoVozilo implements Vozilo {
	int brojPutnika;
	
	public OsobnoVozilo(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	
	@Override
	public String dohvatiTipVozila() {
		return "Osobno vozilo";
	}
	  @Override
	    public String toString() {
	        return "Osobno vozilo, Broj putnika: " + brojPutnika;
	    }
}
