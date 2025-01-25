package Zadatak20;

public class Intern extends Zaposlenik {
	
	public Intern(String ime, String prezime, int godinaZaposlenja) {
		super(ime, prezime, godinaZaposlenja);
	}

	@Override
	public double izracunajPlacu() {
		return 500.0;
	}
	@Override
	public String vrstaOsobe() {
		return "Intern";
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

}
