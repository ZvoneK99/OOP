package Zadatak15;

public abstract class Zaposlenik {
	int ID;
	String imePrezime;
	double osnovnaPlaca;
	
	public Zaposlenik(int ID, String imePrezime, double osnovnaPlaca) {
		this.ID = ID;
		this.imePrezime = imePrezime;
		this.osnovnaPlaca = osnovnaPlaca;
	}
	
	public abstract double izracunajPlacu();
	
	public boolean jeLiIznadProsjeka(double prosjekPlaca) {
		return izracunajPlacu() > prosjekPlaca;
	}
	@Override
	public String toString() {
		return "ID "+ID+" Ime prezime: "+imePrezime+" Osnovna placa "+osnovnaPlaca;
	}
	
}
