package zadatak_04;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(String marka, int godinaProizvodnje, int brojVrata) {
		super(marka, godinaProizvodnje);
		this.brojVrata = brojVrata;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka automobila je "+marka+", godina proizvodnje "+godinaProizvodnje+ " sa brojem vrata "+brojVrata);
	}
}
