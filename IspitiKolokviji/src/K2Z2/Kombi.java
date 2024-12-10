package K2Z2;

public abstract class Kombi extends CestovnoVozilo {
	private double visinaKombija;
	private double duzinaKombija;
	
	public Kombi(String modelVozila, String registracijaVozila, double visinaKombija, double duzinaKombija) {
		super(modelVozila, registracijaVozila);
		this.setDuzinaKombija(visinaKombija);
		this.setDuzinaKombija(duzinaKombija);
	}

	//Getteri i setteri
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
	public int dohvatiMaksimalanBrojPutnika() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dohvatiMaksimalnuNosivost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+" Visina kombija: "+visinaKombija+", Duzina kombija: "+duzinaKombija;
	}
}
