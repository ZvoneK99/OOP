package zadatak2;

public class Planet extends NebeskoTijelo {
	String Naziv;
	
	public Planet(String Naziv, double BrzinaOkoOsi, double BrzinaOkoSunca) {
		super(BrzinaOkoOsi, BrzinaOkoSunca);
		this.Naziv = Naziv;
	}
	
}