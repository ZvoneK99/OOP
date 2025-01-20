package Zadatak5;

public class Menadzer extends Osoba {
	private double osnovnaPlaca;
	private double bonus;
	
	public Menadzer(int ID, String imePrezime, double osnovnaPlaca, double bonus) {
		super(ID, imePrezime);
		this.setOsnovnaPlaca(osnovnaPlaca);
		this.setBonus(bonus);
	}
	
	@Override
	public double dohvatiPlacu() {
		return osnovnaPlaca+bonus;
	}

	public double getOsnovnaPlaca() {
		return osnovnaPlaca;
	}

	public void setOsnovnaPlaca(double osnovnaPlaca) {
		this.osnovnaPlaca = osnovnaPlaca;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+" Osnovna placa: "+getOsnovnaPlaca()+" Bonus "+getBonus();
	}
}
