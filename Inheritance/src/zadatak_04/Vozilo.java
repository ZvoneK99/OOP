package zadatak_04;

public class Vozilo {
	String marka;
	int godinaProizvodnje;
	
	public Vozilo(String marka, int godinaProizvodnje) {
		this.marka = marka;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public void ispisiDetalje() {
		System.out.println("Marka automobila je "+marka+", godina proizvodnje "+godinaProizvodnje);
	}
}
