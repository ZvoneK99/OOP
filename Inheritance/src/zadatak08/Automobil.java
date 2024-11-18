package zadatak08;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(String marka, int godinaProizvodnje, int brojVrata) {
		super(marka, godinaProizvodnje);
		this.brojVrata = brojVrata;
	}
	
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+", Godina proizvodnje: "+godinaProizvodnje+", Broj vrata: "+brojVrata+".");
		System.out.println("Starost Automobila je: "+izracunajStarost()+" godina.");
		System.out.println("-------------------------------------------------------------------------------------------");
	}

}
