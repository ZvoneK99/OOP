package Zadatak29;

public final class Netbook extends PrijenosnoRacunalo{
	
	
	public Netbook(String model, String proizvodjac, String OS, int kapacitetBaterije, double tezina) {
		super(model, proizvodjac, OS, kapacitetBaterije, tezina);
	}
	@Override
	public int izracunajPrenosivost() {
		return 1;
	}
	@Override
	public String dohvatiTipRacunala() {
		return "Netbook "+super.dohvatiTipRacunala();
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
