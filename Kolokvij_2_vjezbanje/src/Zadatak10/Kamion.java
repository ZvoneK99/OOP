package Zadatak10;

public class Kamion extends TransportnoSredstvo {
	private double nosivost;
	private double tezinaTereta;
	
	public Kamion(int ID, String naziv, double nosivost, double tezinaTereta) {
		super(ID, naziv);
		this.setNosivost(nosivost);
		this.setTezinaTereta(tezinaTereta);
	}

	@Override
	public double izracunajUkupnuTezinu() {
		return nosivost+tezinaTereta;
	}

	public double getNosivost() {
		return nosivost;
	}

	public void setNosivost(double nosivost) {
		this.nosivost = nosivost;
	}

	public double getTezinaTereta() {
		return tezinaTereta;
	}

	public void setTezinaTereta(double tezinaTereta) {
		this.tezinaTereta = tezinaTereta;
	}
	@Override
	public String toString() {
		return super.toString()+" Nosivost: "+getNosivost()+" Tezina tereta: "+getTezinaTereta();
	}
}
