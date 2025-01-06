package ZSR3ZAD2;

public class NebeskoTijelo {
	protected double BrzinaOkoOsi;
	protected double BrzinaOkoSunca;
	
	public NebeskoTijelo(double BrzinaOkoOsi, double BrzinaOkoSunca) {
		this.BrzinaOkoOsi = BrzinaOkoOsi;
		this.BrzinaOkoSunca = BrzinaOkoSunca;
	}
	
	@Override
	public String toString() {
		return "Brzina oko osi: "+BrzinaOkoOsi+" Brzina oko sunca: "+BrzinaOkoSunca; 
	}
}
