package primjer05;

public class Automobil extends Vozilo {
	public int brojVrata;
	private String tipGoriva;
	
	public Automobil() {
		this.brojVrata = 0;
		this.tipGoriva = "Nepoznat";
	}
	public Automobil(String marka, String model, int godinaProizvodnje, double cijena, int brojVrata, String tipGoriva) {
		super(marka, model, godinaProizvodnje, cijena);
		this.brojVrata = brojVrata;
		this.tipGoriva = tipGoriva;
	}
		@Override
		public void ispisiDetalje() {
			super.ispisiDetalje();
			System.out.println("Broj vrata: "+brojVrata+", Tip goriva: "+tipGoriva);
		}
}
