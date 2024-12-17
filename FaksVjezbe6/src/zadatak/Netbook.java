package zadatak;

public final class Netbook extends PrijenosnoRacunalo {

	public Netbook(String model, String proizvodac, String operacijskiSustav, int kapacitetBaterija, double tezinaRacunala) {
		super(model, proizvodac, operacijskiSustav, kapacitetBaterija, tezinaRacunala);
	}

	 @Override
	    public String dohvatiTipRacunala() {
	        return "Netbook" + super.dohvatiTipRacunala();
	    }
	 @Override
	    public int izracunajPrenosivost() {
	        return 1;
	    }
	 @Override
	    public String toString() {
	        return super.toString() + ",tip: " + dohvatiTipRacunala()+", Prenosivost: "+izracunajPrenosivost();
	    }
}
