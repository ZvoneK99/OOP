package primjer07;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(String proizvodjac, String model, int godinaProizvodnje, String boja, int brojVrata) {
		super(proizvodjac, model, godinaProizvodnje, boja);
		this.brojVrata = brojVrata;
	}
	@Override
	public void start() {
		System.out.println("Automobil: "+proizvodjac+" "+model+" s "+brojVrata+" vrata je pokrenut.");
	}
}
