package ZSR3ZAD2;

public class Satelit extends NebeskoTijelo {
	protected String Naziv;
	
	public Satelit(String Naziv, double BrzinaOkoOsi, double BrzinaOkoSunca) {
		super(BrzinaOkoOsi, BrzinaOkoSunca);
		this.Naziv = Naziv;
	}
	
	@Override
	public String toString() {
		return "Naziv "+Naziv+" "+super.toString();
	}
}
