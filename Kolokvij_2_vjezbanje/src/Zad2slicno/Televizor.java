package Zad2slicno;

public class Televizor extends OsnovniUredjaj {
	private double dijagonala;
	private String rezolucija;
	
	public Televizor(String nazivUredjaja, boolean stanjeUredjaja, double dijagonala, String rezolucija) {
		super(nazivUredjaja, stanjeUredjaja);
		this.setDijagonala(dijagonala);
		this.setRezolucija(rezolucija);
	}

	
	public double getDijagonala() {
		return dijagonala;
	}
	public void setDijagonala(double dijagonala) {
		this.dijagonala = dijagonala;
	}
	public String getRezolucija() {
		return rezolucija;
	}
	public void setRezolucija(String rezolucija) {
		this.rezolucija = rezolucija;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Dijagonala "+getDijagonala()+" Rezolucija: "+getRezolucija();
	}
}
