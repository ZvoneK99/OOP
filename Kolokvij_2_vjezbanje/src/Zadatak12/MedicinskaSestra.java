package Zadatak12;

public class MedicinskaSestra extends Zaposlenik {
	private int brojSmjena;
	
	public MedicinskaSestra(String ime, int godine, double placa, int brojSmjena) {
		super(ime, godine, placa);
		this.brojSmjena = brojSmjena;
	}

	public int getBrojSmjena() {
		return brojSmjena;
	}

	public void setBrojSmjena(int brojSmjena) {
		this.brojSmjena = brojSmjena;
	}
	public double izracunajPlacu()  {
		return getPlaca() + (brojSmjena * 50);
	}
}
