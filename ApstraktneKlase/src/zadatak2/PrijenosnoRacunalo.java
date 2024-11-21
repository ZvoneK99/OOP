package zadatak2;

public class PrijenosnoRacunalo extends Racunalo {
	private double težina;
	
	public PrijenosnoRacunalo(String proizvođač, String model, double težina) {
		super(proizvođač, model);
		this.težina = težina;
	}
	
	@Override
	public double izracunajPrenosivost() {
		return Math.round(težina);
	}

}
