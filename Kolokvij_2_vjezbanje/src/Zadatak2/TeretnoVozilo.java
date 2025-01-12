package Zadatak2;

public class TeretnoVozilo extends CestovnoVozilo {
	private int brojOsovina;
	private double maksimalnaNosivost;
	
	public TeretnoVozilo(String modelVozila, String registracijaVozila, int brojOsovina, double maksimalnaNosivost) {
		super(modelVozila, registracijaVozila);
		this.brojOsovina = brojOsovina;
		this.maksimalnaNosivost = maksimalnaNosivost;
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
		return super.toString()+" Broj osovina "+getBrojOsovina()+" Maksimalna nosivost "+getMaksimalnaNosivost();
	}
}
