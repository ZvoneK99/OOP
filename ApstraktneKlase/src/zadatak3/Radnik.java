package zadatak3;

public class Radnik extends Zaposlenik {
	int brojSati;
	double satnica;
	
	public Radnik(String ime, double osnovnaPlaca, int brojSati, double satnica) {
		super(ime, osnovnaPlaca);
		this.brojSati = brojSati;
		this.satnica = satnica;
	}
	
	@Override
	public double izracunajPlacu() {
		return brojSati*satnica;
	}

}
