package ZSR4_1;

public class PrijenosnoRacunalo extends Racunalo {
	private int kapacitetBaterije;
	private double tezinaRacunala;
	
	public PrijenosnoRacunalo(String model, String proizvodjac, String operacijskiSustav, int kapacitetBaterije, double tezinaRacunala) {
		super(model, proizvodjac, operacijskiSustav);
		this.kapacitetBaterije = kapacitetBaterije;
		this.tezinaRacunala = tezinaRacunala;
	}
	
	//Getter i setter
	public int getKapacitetBaterije() {
		return kapacitetBaterije;
	}
	public void setKapacitetBaterije(int kapacitetBaterije) {
		this.kapacitetBaterije = kapacitetBaterije;
	}
	public double getTezinaRacunala() {
		return tezinaRacunala;
	}
	public void setTezinaRacunala(double tezinaRacunala) {
		this.tezinaRacunala = tezinaRacunala;
	}
	
	@Override
	public String dohvatiTipRacunala() {
		return "Prijenosno racunalo";
	}
	@Override
	public int izracunajPrenosivost() {
		return (int) (tezinaRacunala);
	}
	
	@Override
	public String toString() {
		return super.toString()+", Kapacitet baterije "+kapacitetBaterije+", Tezina racunala "+tezinaRacunala+".";
	}
}
