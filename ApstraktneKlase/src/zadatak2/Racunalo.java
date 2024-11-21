package zadatak2;

public abstract class Racunalo {
	protected String proizvođač;
	protected String model;
	
	public Racunalo(String proizvođač, String model) {
		this.proizvođač = proizvođač;
		this.model = model;
	}
	public abstract double izracunajPrenosivost();
	
	public void ispisiDetalje() {
		System.out.println("Proizvođač: "+proizvođač+", Model: "+model+".");
	}
}
