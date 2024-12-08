package zadatak7;

public class Planet extends NebeskoTijelo {
	String naziv;
	
	public Planet(String naziv, double brzinaOkoOsi, double brzinaOkoSunca) {
		super(brzinaOkoOsi, brzinaOkoSunca);
		this.naziv = naziv;
	}
	
	@Override
	public String opis() {
		return "Planet ["+naziv+"] - Brzina oko osi: ["+getBrzinaOkoOsi()+"], Brzina oko Sunca: ["+getBrzinaOkoSunca()+"]";
	}

}
