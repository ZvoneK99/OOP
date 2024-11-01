package zadatak_03;

public class Vozilo {
	String marka;
	int godinaProizvodnje;
	
	public Vozilo(String marka, int godinaProizvodnje) {
		this.marka = marka;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public void ispisiDetalje() {
		System.out.println("Marka vozila je "+marka+", a godina proizvodnje je "+godinaProizvodnje);
	}
}
