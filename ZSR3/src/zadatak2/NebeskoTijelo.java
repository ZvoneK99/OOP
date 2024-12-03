package zadatak2;

public class NebeskoTijelo {
	double BrzinaOkoOsi;
	double BrzinaOkoSunca;
	
	public NebeskoTijelo(double BrzinaOkoOsi, double BrzinaOkoSunca) {
		this.BrzinaOkoOsi = BrzinaOkoOsi;
		this.BrzinaOkoSunca = BrzinaOkoSunca;
	}
	@Override
	public String toString() {
		return "Brzina oko osi: "+BrzinaOkoOsi+" km/h, Brzina oko Sunca: "+BrzinaOkoSunca+" km/h."; 
	}
	
}
