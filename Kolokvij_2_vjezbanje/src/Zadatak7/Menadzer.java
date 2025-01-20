package Zadatak7;

public class Menadzer extends Zaposlenik {
	private double bonus;
	
	public Menadzer(String ime, int godine, double osnovnaPlaca, double bonus) {
		super(ime, godine, osnovnaPlaca);
		this.setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String dohvatiIme() {
		return getIme();
	}
	@Override
	public int dohvatiGodine() {
		return getGodine();
	}
	@Override
	public double izracunajPlacu() {
		return getOsnovnaPlaca()+bonus;
	}
	@Override
	public String toString() {
		return super.toString()+ " Bonus: "+getBonus();
	}
}
