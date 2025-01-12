package Zadatak2;

public class TeretniKombi extends Kombi {
	private double zapreminaPrtljaznogProstora;

	public TeretniKombi(String modelVozila, String registracijaVozila, double visinaKombija, double duzinaKombija, double zapreminaPrtljaznogProstora) {
		super(modelVozila, registracijaVozila, visinaKombija, duzinaKombija);
		this.zapreminaPrtljaznogProstora = zapreminaPrtljaznogProstora;
	}
	
	public double getZapreminaPrtljaznogProstora() {
		return zapreminaPrtljaznogProstora;
	}

	public void setZapreminaPrtljaznogProstora(double zapreminaPrtljaznogProstora) {
		this.zapreminaPrtljaznogProstora = zapreminaPrtljaznogProstora;
	}
	@Override
	public double dohvatiMaksimalnuNosivost() {
		return zapreminaPrtljaznogProstora / 0.00375;
	}
	@Override 
	public String toString() {
		return super.toString()+" Zapremina prtljaznog prostora "+getZapreminaPrtljaznogProstora();
	}
}
