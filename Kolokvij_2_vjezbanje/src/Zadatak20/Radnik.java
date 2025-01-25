package Zadatak20;

public class Radnik extends Zaposlenik{
	private double satnica;
	
	public Radnik(String ime, String prezime, int godinaZaposlenja, double satnica) {
		super(ime, prezime, godinaZaposlenja);
		this.satnica = satnica;
	}
	public double getSatnica() {
		return satnica;
	}
	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}
	@Override
	public double izracunajPlacu() {
		return (getStaz() * 500) + (160 * getSatnica());
	}
	@Override
	public String vrstaOsobe() {
		return "Radnik";
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Satnica ").append(getSatnica());
		return sb.toString();
	}
}
