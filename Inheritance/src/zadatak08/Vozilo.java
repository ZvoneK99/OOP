package zadatak08;

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
}
