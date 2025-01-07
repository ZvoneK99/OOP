package zad1_novo;

public final class Netbook extends PrijenosnoRacunalo {
	public Netbook(String model, String proizvodjac, String OS, int baterija, double tezina) {
		super(model, proizvodjac, OS, baterija, tezina);
	}
	
	@Override
	public String dohvatiTipRacunala() {
		return "Netbook "+ super.dohvatiTipRacunala();
	}
	
	@Override
	public int izracunajPrenosivost() {
		return 1;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
