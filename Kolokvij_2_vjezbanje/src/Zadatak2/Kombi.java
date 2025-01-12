package Zadatak2;

public abstract class Kombi extends CestovnoVozilo {
	private double visinaKombija;
	private double duzinaKombija;
	
	public Kombi(String modelVozila, String registracijaVozila, double visinaKombija, double duzinaKombija) {
		super(modelVozila, registracijaVozila);
		this.visinaKombija = visinaKombija;
		this.duzinaKombija = duzinaKombija;
	}
	
	public double getVisinaKombija() {
		return visinaKombija;
	}
	public void setVisinaKombija(double visinaKombija) {
		this.visinaKombija = visinaKombija;
	}
	public double getDuzinaKombija() {
		return duzinaKombija;
	}
	public void setDuzinaKombija(double duzinaKombija) {
		this.duzinaKombija = duzinaKombija;
	}
	@Override
	public String toString() {
		return super.toString()+ " Visina kombija "+getVisinaKombija()+" Duzina kombija "+getDuzinaKombija(); 
	}
}
