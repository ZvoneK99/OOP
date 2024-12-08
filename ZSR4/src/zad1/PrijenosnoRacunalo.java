package zad1;

public class PrijenosnoRacunalo extends Racunalo {
	private int kapacitetBaterije;
	private double tezina;
	
	public PrijenosnoRacunalo(String model, String proizvodjac, String  operacijskiSustav, int kapacitetBaterije, double tezina) {
		super(model, proizvodjac, operacijskiSustav);
		this.setKapacitetBaterije(kapacitetBaterije);
		this.tezina = tezina;
	}

	@Override
	public String dohvatiTipRacunala() {
		return "Prijenosno racunalo";
	}

	@Override
	public int izracunajPrenosivost() {
		return (int) Math.round(tezina);
	}

	public int getKapacitetBaterije() {
		return kapacitetBaterije;
	}

	public void setKapacitetBaterije(int kapacitetBaterije) {
		this.kapacitetBaterije = kapacitetBaterije;
	}
	public double getTezine() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	@Override
	public String toString() {
		return super.toString()+" Kapacitet baterije: "+kapacitetBaterije+", Tezina: "+tezina+".";
	}
}
