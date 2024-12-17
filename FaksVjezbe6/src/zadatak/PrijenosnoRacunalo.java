package zadatak;

public class PrijenosnoRacunalo extends Racunalo {
	private int kapacitetBaterija;
	private double tezinaRacunala;
	
	public PrijenosnoRacunalo(String model, String proizvodac, String operacijskiSustav, int kapacitetBaterija, double tezinaRacunala) {
		super(model, proizvodac, operacijskiSustav);
		this.kapacitetBaterija = kapacitetBaterija;
		this.tezinaRacunala = tezinaRacunala;
	}

	//Get i set
	public void setKapacitetBaterija(int kapacitetBaterija) {
		this.kapacitetBaterija = kapacitetBaterija;
	}
	public double getTezinaRacunala() {
		return tezinaRacunala;
	}
	public void setTezinaRacunala(double tezinaRacunala) {
		this.tezinaRacunala = tezinaRacunala;
	}
	public int getKapacitetBaterija() {
		return kapacitetBaterija;
	}
	
	
	@Override
	public String dohvatiTipRacunala() {
		return "prijenosno racunalo";
	}
	@Override
	public int izracunajPrenosivost() {
		return (int) (tezinaRacunala);
	}
	 @Override
	    public String toString() {
	        return super.toString() + ",tip: " + dohvatiTipRacunala()+", Prenosivost: "+izracunajPrenosivost();
	    }
	
}
