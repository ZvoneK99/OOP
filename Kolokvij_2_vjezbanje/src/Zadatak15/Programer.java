package Zadatak15;

public class Programer extends Zaposlenik implements RadniUcinak{
	int brojPrekovremenihSati;
	double satnica;
	
	public Programer(int ID, String imePrezime, double osnovnaPlaca, int brojPrekovremenihSati, double satnica) {
		super(ID, imePrezime, osnovnaPlaca);
		this.brojPrekovremenihSati = brojPrekovremenihSati;
		this.satnica = satnica;
	}

	@Override
	public double izracunajPlacu() {
		return osnovnaPlaca + (brojPrekovremenihSati * satnica);
	}

	@Override
	public double izracunajUcinak() {
		return brojPrekovremenihSati * 10;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj prekovremenih sati "+brojPrekovremenihSati+" Satnica "+satnica;
	}
}
