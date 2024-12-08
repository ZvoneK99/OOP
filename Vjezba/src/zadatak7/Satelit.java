package zadatak7;

public class Satelit extends NebeskoTijelo {
	String naziv;
	
	public Satelit(String naziv, double brzinaOkoOsi, double brzinaOkoSunca) {
		super(brzinaOkoOsi, brzinaOkoSunca);
		this.naziv = naziv;
	}
	@Override
	public String opis() {
		return "Satelit ["+naziv+"] - Brzina oko osi: ["+getBrzinaOkoOsi()+"], Brzina oko Sunca: ["+getBrzinaOkoSunca()+"].";
	}

}
