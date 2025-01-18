package Zadatak2novo;

public class TeretnoVozilo extends CestovnoVozilo {
	private int brojOsovina;
	private double maksimalnaNosivost;
	
	public TeretnoVozilo(String modelVozila, String registracijaVozila, int brojOsovina, double maksimalnaNosivost) {
		super(modelVozila, registracijaVozila);
		this.setBrojOsovina(brojOsovina);
		this.setMaksimalnaNosivost(maksimalnaNosivost);
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}

	public double getMaksimalnaNosivost() {
		return maksimalnaNosivost;
	}

	public void setMaksimalnaNosivost(double maksimalnaNosivost) {
		this.maksimalnaNosivost = maksimalnaNosivost;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj osovina: "+getBrojOsovina()+", Maksimalna nosivost: "+getMaksimalnaNosivost();
	}

	@Override
	public int dohvatiMaksimalanBrojPutnika() {
		return 0;
	}

	@Override
	public double dohvatiMaksimalnuNosivost() {
		return maksimalnaNosivost;
	}
}
