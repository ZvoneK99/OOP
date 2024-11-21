package zadatak1;

public class Krug extends Oblik {
	private double radijus;
	
	public Krug(String naziv, double radijus) {
		super(naziv);
		this.radijus = radijus;
	}
	@Override
	public double izračunajPovršinu() {
		return Math.PI * radijus * radijus;
	}

	@Override
	public double izračunajOpseg() {
		return 2 * Math.PI * radijus;
	}

}
