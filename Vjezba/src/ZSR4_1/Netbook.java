package ZSR4_1;

public final class Netbook extends PrijenosnoRacunalo {

	public Netbook(String model, String proizvodjac, String operacijskiSustav, int kapacitetBaterije,
			double tezinaRacunala) {
		super(model, proizvodjac, operacijskiSustav, kapacitetBaterije, tezinaRacunala);
	}
	
	@Override
	public int izracunajPrenosivost() {
		return 1;
	}
	@Override
	public String dohvatiTipRacunala() {
		return "Netbook prijenosno racunalo";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
