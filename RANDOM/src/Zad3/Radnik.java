package Zad3;

public class Radnik extends Osoba implements Zaposlenik {
	double satnica;
	int brojSati;
	
	public Radnik(String ime, String prezime, int godine, double satnica, int brojSati) {
		super(ime, prezime, godine);
		this.satnica = satnica;
		this.brojSati = brojSati;
	}

	@Override
	public String dohvatiPoziciju() {
		return "Radnik";
	}

	@Override
	public double izracunajPlacu() {
		return satnica*brojSati;
	}

}
