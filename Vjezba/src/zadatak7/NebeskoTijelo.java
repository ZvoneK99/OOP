package zadatak7;

public abstract class NebeskoTijelo {
	private double brzinaOkoOsi;
	private double brzinaOkoSunca;
	
	public NebeskoTijelo(double brzinaOkoOsi, double brzinaOkoSunca ) {
		this.brzinaOkoOsi = brzinaOkoOsi;
		this.setBrzinaOkoSunca(brzinaOkoSunca);
	}
	public double getBrzinaOkoOsi() {
		return brzinaOkoOsi;
	}
	public void setBrzinaOkoOsi(double brzinaOkoOsi) {
		this.brzinaOkoOsi = brzinaOkoOsi;
	}
	public double getBrzinaOkoSunca() {
		return brzinaOkoSunca;
	}
	public void setBrzinaOkoSunca(double brzinaOkoSunca) {
		this.brzinaOkoSunca = brzinaOkoSunca;
	}
	public abstract String opis();
}
