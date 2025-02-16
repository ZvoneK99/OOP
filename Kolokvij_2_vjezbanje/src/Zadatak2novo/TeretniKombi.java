package Zadatak2novo;

public class TeretniKombi extends Kombi {
	private double zapreminaPrtljaznogProstora;
	
	public TeretniKombi(String modelVozila, String registracijaVozila, double visinaKombija, double duzinaKombija, double zapreminaPrtljaznogProstora) {
		super(modelVozila, registracijaVozila, visinaKombija, duzinaKombija);
		this.setZapreminaPrtljaznogProstora(zapreminaPrtljaznogProstora);
	}

	public double getZapreminaPrtljaznogProstora() {
		return zapreminaPrtljaznogProstora;
	}

	public void setZapreminaPrtljaznogProstora(double zapreminaPrtljaznogProstora) {
		this.zapreminaPrtljaznogProstora = zapreminaPrtljaznogProstora;
	}
	@Override
	public String toString() {
		return super.toString()+" Zapremina przljaznog prostora: "+getZapreminaPrtljaznogProstora();
	}

	@Override
	public int dohvatiMaksimalanBrojPutnika() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dohvatiMaksimalnuNosivost() {
		return zapreminaPrtljaznogProstora / 0.00375;
	}
	
	
}
