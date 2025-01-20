package Zadatak7;

public abstract class Zaposlenik implements Osoba {
	private String ime;
	private int godine;
	private double osnovnaPlaca;
	
	public Zaposlenik(String ime, int godine, double osnovnaPlaca) {
		this.setIme(ime);
		this.setGodine(godine);
		this.setOsnovnaPlaca(osnovnaPlaca);
	}
	@Override
	public String dohvatiIme() {
		return ime;
	}

	@Override
	public int dohvatiGodine() {
		return godine;
	}

	@Override
	public double izracunajPlacu() {
		return osnovnaPlaca;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public double getOsnovnaPlaca() {
		return osnovnaPlaca;
	}

	public void setOsnovnaPlaca(double osnovnaPlaca) {
		this.osnovnaPlaca = osnovnaPlaca;
	}
	@Override
	public String toString() {
		return "Ime "+getIme()+" Godine: "+getGodine()+" Osnovna placa "+getOsnovnaPlaca(); 
	}
}
