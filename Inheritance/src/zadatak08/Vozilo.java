package zadatak08;

import java.util.Calendar;

public abstract class Vozilo {
	String marka;
	int godinaProizvodnje;
	
	public Vozilo(String marka, int godinaProizvodnje) {
		this.marka = marka;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public String getMarka() {
		return this.marka;
	}
	public int getGodinaProizvodnje() {
		return this.godinaProizvodnje;
	}
	public abstract void ispisiDetalje();
	public abstract void ispisiNazivVozila();
	public int izracunajStarost() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		return trenutnaGodina-this.godinaProizvodnje;
	}
}

