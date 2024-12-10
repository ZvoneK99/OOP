package zad3;

public abstract class Kombi extends CestovnoVozilo {
	double visinaKombija;
	double duzinaKombija;
	
	public Kombi(String modelVozila, String registracijskaOznaka, double visinaKombija, double duzinaKombija) {
		super(modelVozila, registracijskaOznaka);
		this.visinaKombija = visinaKombija;
		this.duzinaKombija = duzinaKombija;
	}
	
	
}
