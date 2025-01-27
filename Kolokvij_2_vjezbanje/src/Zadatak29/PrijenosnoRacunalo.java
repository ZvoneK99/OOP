package Zadatak29;

public class PrijenosnoRacunalo extends Racunalo{
	private int kapacitetBaterije;
	private double tezina;
	
	public PrijenosnoRacunalo(String model, String proizvodjac, String OS, int kapacitetBaterije, double tezina) {
		super(model, proizvodjac, OS);
		this.setKapacitetBaterije(kapacitetBaterije);
		this.setTezina(tezina);
	}

	public int getKapacitetBaterije() {
		return kapacitetBaterije;
	}

	public void setKapacitetBaterije(int kapacitetBaterije) {
		this.kapacitetBaterije = kapacitetBaterije;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	@Override
	public String dohvatiTipRacunala() {
		return "Prijenosno racunalo";
	}
	@Override
	public int izracunajPrenosivost() {
		return (int) (tezina);
	}
	@Override
	public String toString() {
		return super.toString()+" Kapacitet baterije "+getKapacitetBaterije()+"mAh Tezina "+getTezina();
	}
}
