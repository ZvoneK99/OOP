package zadatak3;

public abstract class Zaposlenik {
	String ime;
	double osnovnaPlaca;
	
	public Zaposlenik(String ime, double osnovnaPlaca) {
		this.ime = ime;
		this.osnovnaPlaca = osnovnaPlaca;
	}
	public abstract double izracunajPlacu();
	
	public void ispisiDetalje() {
		System.out.println("Ime: "+ime);
	}
}
