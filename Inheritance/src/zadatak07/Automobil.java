package zadatak07;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(String marka, String model, int godinaProizvodnje, int brojVrata) {
		super(marka,model,godinaProizvodnje);
		this.brojVrata = brojVrata;
	}
	public void provjeriBrojVrata() {
		if(brojVrata<=0) {
			System.out.println("Neispravan broj vrata.");
		}
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+"; Model: "+model+"; Godina proizvodnje: "+godinaProizvodnje+"; Broj vrata: "+brojVrata+".");
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
