package Zadatak15;

public class Voditelj extends Zaposlenik implements RadniUcinak{
	int brojProjekata;
	double bonusPoProjektu;
	
	public Voditelj(int ID, String imePrezime, double osnovnaPlaca, int brojProjekata, double bonusPoProjektu) {
		super(ID, imePrezime, osnovnaPlaca);
		this.brojProjekata = brojProjekata;
		this.bonusPoProjektu = bonusPoProjektu;
	}

	@Override
	public double izracunajPlacu() {
		return osnovnaPlaca + (brojProjekata * bonusPoProjektu);
	}

	@Override
	public double izracunajUcinak() {
		return brojProjekata * 15;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj projekata: "+brojProjekata+" Bonus po projektu "+bonusPoProjektu;
	}
	
}
