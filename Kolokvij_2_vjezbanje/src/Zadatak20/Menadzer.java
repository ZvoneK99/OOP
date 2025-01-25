package Zadatak20;

public class Menadzer extends Zaposlenik{
	private double bonus;
	
	public Menadzer(String ime, String prezime, int godinaZaposlenja, double bonus) {
		super(ime, prezime, godinaZaposlenja);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public double izracunajPlacu() {
		return (getStaz() * 1000) + getBonus();
	}
	@Override
	public String vrstaOsobe() {
		return "Menadžer";
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Bouns ").append(getBonus());
		return sb.toString();
	}
}
