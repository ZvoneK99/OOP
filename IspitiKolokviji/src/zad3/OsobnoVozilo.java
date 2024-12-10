package zad3;

public class OsobnoVozilo extends CestovnoVozilo {
	String tipOsobnogVozila;
	int brojSjedala;
	double zapreminaPrtljaznika;
	
	public OsobnoVozilo(String modelVozila, String registracijskaOznaka, String tipOsobnogVozila, int brojSjedala, double zapreminaPrtljaznika) {
		super(modelVozila, registracijskaOznaka);
		this.tipOsobnogVozila = tipOsobnogVozila;
		this.brojSjedala = brojSjedala;
		this.zapreminaPrtljaznika = zapreminaPrtljaznika;
	}
	
	public int dohvatiMaksimalanBrojPutnika() {
		int maxBrojPutnika = brojSjedala;
		return maxBrojPutnika;
	}
	public double dohvatiMaksimalnuNosivost() {
		double maxNosivost = zapreminaPrtljaznika;
		return maxNosivost;
	}
	@Override
	public String toString() {
		return "Model"+modelVozila+", Reg. oznaka: "+registracijskaOznaka+", Tip: "+tipOsobnogVozila+", Broj sjedala: "+brojSjedala+", Zapremina: "+zapreminaPrtljaznika;
	}
}
