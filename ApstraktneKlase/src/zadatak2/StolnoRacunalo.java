package zadatak2;

public class StolnoRacunalo extends Racunalo {
	private double[] dimenzijeKucista;
	
	public StolnoRacunalo(String proizvođač, String model, double[] dimenzijeKucista) {
		super(proizvođač, model);
		this.dimenzijeKucista = dimenzijeKucista;
	}
	
	@Override
	public double izracunajPrenosivost() {
		double volumen = dimenzijeKucista[0] * dimenzijeKucista[1] * dimenzijeKucista[2];
		return 5 + volumen / 30;
	}
}
