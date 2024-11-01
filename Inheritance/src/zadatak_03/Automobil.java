package zadatak_03;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(String marka, int godinaProizvodnje, int brojVrata) {
		super(marka, godinaProizvodnje);
		this.brojVrata = brojVrata;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka vozila je "+marka+", a godina proizvodnje je "+godinaProizvodnje+ ", a broj vrata je "+brojVrata);
	}
}
