package Zadatak2novo;

public class OsobnoVozilo extends CestovnoVozilo {
	private String tipOsobnogVozila;
	private int brojSjedala;
	private double zapreminaPrtljaznika;

	public OsobnoVozilo(String modelVozila, String registracijaVozila, String tipOsobnogVozila, int brojSjedala, double zapreminaPrtljaznika) {
		super(modelVozila, registracijaVozila);
		this.setTipOsobnogVozila(tipOsobnogVozila);
		this.setBrojSjedala(brojSjedala);
		this.setZapreminaPrtljaznika(zapreminaPrtljaznika);
	}

	public String getTipOsobnogVozila() {
		return tipOsobnogVozila;
	}

	public void setTipOsobnogVozila(String tipOsobnogVozila) {
		this.tipOsobnogVozila = tipOsobnogVozila;
	}

	public int getBrojSjedala() {
		return brojSjedala;
	}

	public void setBrojSjedala(int brojSjedala) {
		this.brojSjedala = brojSjedala;
	}

	public double getZapreminaPrtljaznika() {
		return zapreminaPrtljaznika;
	}

	public void setZapreminaPrtljaznika(double zapreminaPrtljaznika) {
		this.zapreminaPrtljaznika = zapreminaPrtljaznika;
	}
	@Override
	public String toString() {
		return super.toString()+" Tip osobnog vozila: "+getTipOsobnogVozila()+", Broj sjedala: "+getBrojSjedala()+", Zapremina prtljaznika: "+getZapreminaPrtljaznika();
	}

	@Override
	public int dohvatiMaksimalanBrojPutnika() {
		return brojSjedala;
	}

	@Override
	public double dohvatiMaksimalnuNosivost() {
		return zapreminaPrtljaznika / 0.00375;
	}
}

