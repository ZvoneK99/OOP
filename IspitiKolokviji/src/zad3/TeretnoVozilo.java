package zad3;

public class TeretnoVozilo extends CestovnoVozilo {
	int brojOsovina;
	double maksimalnaNosivost;
	
	public TeretnoVozilo(String modelVozila, String registracijskaOznaka, int brojOsovina, double maksimalnaNosivost) {
		super(modelVozila, registracijskaOznaka);
		this.brojOsovina = brojOsovina;
		this.maksimalnaNosivost = maksimalnaNosivost;
	}
}
