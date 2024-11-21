package zadatak1;

public class Pravokutnik extends Oblik {
	private double visina;
	private double širina;
	
	public Pravokutnik(String naziv, double visina, double širina) {
		super(naziv);
		this.visina = visina;
		this.širina = širina;
	}
	public double getVisina() {
		return this.visina;
	}
	public double getŠirina() {
		return this.širina;
	}
	@Override
	public double izračunajPovršinu() {
		return visina * širina;
	}

	@Override
	public double izračunajOpseg() {
		return 2 * (visina + širina);
	}

}
