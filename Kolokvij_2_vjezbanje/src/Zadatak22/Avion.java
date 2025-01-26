package Zadatak22;

public class Avion {
	private String registracija;
	private int kapacitetPutnika;
	private double maksimalnaNosivost;
	
	public Avion(String registracija, int kapacitetPutnika, double maksimalnaNosivost) {
		this.setRegistracija(registracija);
		this.setKapacitetPutnika(kapacitetPutnika);
		this.setMaksimalnaNosivost(maksimalnaNosivost);
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}

	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}

	public double getMaksimalnaNosivost() {
		return maksimalnaNosivost;
	}

	public void setMaksimalnaNosivost(double maksimalnaNosivost) {
		this.maksimalnaNosivost = maksimalnaNosivost;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" REG ").append(getRegistracija()).append(" Kapacitet putnika ").append(getKapacitetPutnika()).append(" Maksimalna nosivost ").append(getMaksimalnaNosivost());
		return sb.toString();
	}
}
