package Zadatak12;

public class Specijalist extends Lijecnik {
	private int certifikati;
	
	public Specijalist(String ime, int godine, double placa, String specijalizacija, int brojPacijenata, int certifikati) {
		super(ime, godine, placa, specijalizacija, brojPacijenata);
		this.setCertifikati(certifikati);
	}

	public int getCertifikati() {
		return certifikati;
	}

	public void setCertifikati(int certifikati) {
		this.certifikati = certifikati;
	}
	@Override
	public double izracunajPlacu() {
		return getPlaca() +(500 * getBrojPacijenata()) + (100 * certifikati);
	}
}
