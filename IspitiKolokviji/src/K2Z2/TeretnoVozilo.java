package K2Z2;

public class TeretnoVozilo extends CestovnoVozilo {
	private int brojOsovina;
	private double maksimalnaNosivost;
	
	public TeretnoVozilo(String modelVozila, String registracijaVozila, int brojOsovina, double maksimalnaNosivost) {
		super(modelVozila, registracijaVozila);
		this.setBrojOsovina(brojOsovina);
		this.setMaksimalnaNosivost(maksimalnaNosivost);
		
	}
	//Getteri i setteri
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
	public double dohvatiMaksimalnuNosivost() {
		return maksimalnaNosivost;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Broj osovina "+brojOsovina+", Maksimalna nosivost: "+maksimalnaNosivost;
	}
}
