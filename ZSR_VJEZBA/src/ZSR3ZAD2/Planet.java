package ZSR3ZAD2;

public class Planet extends NebeskoTijelo {
	protected String Naziv;
	
	public Planet(String Naziv, double BrzinaOkoOsi, double BrzinaOkoSunca) {
		super(BrzinaOkoOsi, BrzinaOkoSunca);
		this.Naziv = Naziv;
	}
	
	@Override
	public String toString() {
		return "Naziv "+Naziv+" "+super.toString();
	}
}
