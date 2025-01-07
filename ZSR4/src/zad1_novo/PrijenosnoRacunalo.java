package zad1_novo;

public class PrijenosnoRacunalo extends Racunalo {
	private int baterija;
	private double tezina;
	
	public PrijenosnoRacunalo(String model, String proizvodjac, String OS, int baterija, double tezina) {
		super(model, proizvodjac, OS);
		this.baterija = baterija;
		this.tezina = tezina;
	}
	
	public int getBaterija() {
		return baterija;
	}
	public void setBaterija(int baterija) {
		this.baterija = baterija;
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
		return super.toString()+" Baterija: "+baterija+" mAh, Tezina: "+tezina;
	}
}
