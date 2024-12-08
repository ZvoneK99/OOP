package zad1;

final public class Netbook extends PrijenosnoRacunalo {

	public Netbook(String model, String proizvodjac, String operacijskiSustav, int kapacitetBaterije, double tezina) {
		super(model, proizvodjac, operacijskiSustav, kapacitetBaterije, tezina);
	}
	public int izracunajPrenosivost() {
		return 1;
	}
	public String dohvatiTipRacunala() {
		return "Netbook "+super.dohvatiTipRacunala();
	}
	@Override 
	public String toString() {
		return super.toString()+" Tip: "+dohvatiTipRacunala()+" Prenosivost: "+izracunajPrenosivost();
	}
}
