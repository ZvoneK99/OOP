package zadatak2;

public class Satelit extends NebeskoTijelo {
	String Naziv;
	
	public Satelit(String Naziv, double BrzinaOkoOsi, double BrzinaOkoSunca) {
		super(BrzinaOkoOsi, BrzinaOkoSunca);
		this.Naziv = Naziv;
	}
	
}
