package Zadatak7;

public class Inzinjer extends Zaposlenik {
	private int brojProjekata;
	
	public Inzinjer(String ime, int godine, double osnovnaPlaca, int brojProjekata) {
		super(ime, godine, osnovnaPlaca);
		this.setBrojProjekata(brojProjekata);
	}
	//getter i setter
	public int getBrojProjekata() {
		return brojProjekata;
	}

	public void setBrojProjekata(int brojProjekata) {
		this.brojProjekata = brojProjekata;
	}
	@Override
	public String dohvatiIme() {
		return getIme();
	}
	@Override
	public int dohvatiGodine() {
		return getGodine();
	}
	@Override
	public double izracunajPlacu() {
		return getOsnovnaPlaca()+(brojProjekata * 500);

	}
	@Override
	public String toString() {
		return super.toString()+ " Broj projekata: "+getBrojProjekata();
	}
}
