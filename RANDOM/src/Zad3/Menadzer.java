package Zad3;

public class Menadzer extends Osoba implements Zaposlenik {
	double bonus;
	
	public Menadzer(String ime, String prezime, int godine, double bonus) {
		super(ime, prezime, godine);
		this.bonus = bonus;
	}
	@Override
	public String dohvatiPoziciju() {
		return "Menadzer";
	}

	@Override
	public double izracunajPlacu() {
		return 1000+bonus;
	}

}
