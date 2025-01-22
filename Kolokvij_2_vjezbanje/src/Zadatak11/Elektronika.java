package Zadatak11;

public class Elektronika extends Proizvod{
	private double osnovnaCijena;
	private int garancijaGodine;
	
	public Elektronika(int ID, String naziv, double osnovnaCijena, int garancijaGodine) {
		super(ID, naziv);
		this.osnovnaCijena = osnovnaCijena;
		this.garancijaGodine = garancijaGodine;
	}
	@Override
	public double izracunajCijenu() {
		return osnovnaCijena * (1+ garancijaGodine * 0.1);
	}
	public double getOsnovnaCijena() {
		return osnovnaCijena;
	}
	public void setOsnovnaCijena(double osnovnaCijena) {
		this.osnovnaCijena = osnovnaCijena;
	}
	public int getGarancijaGodine() {
		return garancijaGodine;
	}
	public void setGarancijaGodine(int garancijaGodine) {
		this.garancijaGodine = garancijaGodine;
	}
	@Override
	public String toString() {
		return super.toString()+" Osnovna cijena "+getOsnovnaCijena()+" Garancija godine "+getGarancijaGodine();
	}
}
