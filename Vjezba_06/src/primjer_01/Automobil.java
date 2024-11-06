package primjer_01;

public class Automobil extends Vozilo {
	private int brojVrata;
	
	public Automobil(String marka, String model, int godinaProizvodnje, double cijena, int brojVrata) {
		super(marka, model, godinaProizvodnje, cijena);
		this.brojVrata = brojVrata;
	}
		//Getter i setter za brojVrata
		public int getBrojVrata() {
			return this.brojVrata;
		}
		public void setBrojVrata(int brojVrata) {
			this.brojVrata = brojVrata;
		}
	@Override
	public void ispisiDetalje() {
		System.out.println("------Podatci o Automobilu-----");
		System.out.println("Marka automobila: "+getMarka());
		System.out.println("Model automobila: "+getModel());
		System.out.println("Godina proizvodnje: "+getGodinaProizvodnje());
		System.out.println("Cijena automobila: "+getCijena()+"$");
		System.out.println("Broj vrata: "+brojVrata);
	}
}
