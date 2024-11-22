package zadatak3;

public class Menadžer extends Zaposlenik {
	double bonus;
	
	public Menadžer(String ime, double osnovnaPlaca, double bonus) {
		super(ime, osnovnaPlaca);
		this.bonus = bonus;
	}
	@Override
	public double izracunajPlacu() {
		return osnovnaPlaca+bonus;
	}

}
