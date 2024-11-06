package primjer_01;

public class Kamion extends Vozilo {
	private double nosivost;
	
	public Kamion(String marka, String model, int godinaProizvodnje, double cijena, double nosivost) {
		super(marka, model, godinaProizvodnje, cijena);
		this.nosivost = nosivost;
	}
		//Getter i Setter za nosivost
		public double getNosivost() {
			return this.nosivost;
		}
		public void settNosivost(double nosivost) {
			this.nosivost = nosivost;
		}
	@Override
	public void ispisiDetalje() {
		System.out.println("------Podatci o Kamionu-----");
		System.out.println("Marka kamiona: "+getMarka());
		System.out.println("Model kamiona: "+getModel());
		System.out.println("Godina proizvodnje: "+getGodinaProizvodnje());
		System.out.println("Cijena kamiona: "+getCijena()+"$");
		System.out.println("Nosivost: "+nosivost+" tona");
	}
}
