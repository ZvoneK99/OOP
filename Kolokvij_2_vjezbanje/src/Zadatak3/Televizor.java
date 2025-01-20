package Zadatak3;

public class Televizor extends OsnovniUredaj {
	private double dijagonala;
	private String rezolucija;
	
	public Televizor(String naziv, double dijagonala, String rezolucija) {
		super(naziv);
		this.dijagonala = dijagonala;
		this.rezolucija = rezolucija;
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
		return super.toString()+" Dijagonala: "+getDijagonala()+" Rezolucija: "+getRezolucija();
	}
}
