package zadatak_05;

public class Vozilo {
	String marka;
	int godinaProizvodnje;
	
	public Vozilo(String marka, int godinaProizvodnje) {
		this.marka = marka;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public void ispisiDetalje() {
		System.out.println("Automobil marke "+marka+" je proizveden "+godinaProizvodnje+". godine.");
	}
}
