package VJEZBEFAKSREDO;

public abstract class Natjecatelj implements Prijava {
	private String ime;
	private int duzina;
	
	public Natjecatelj(String ime, int duzina) {
		this.ime = ime;
		this.duzina = duzina;
	}
	public Natjecatelj(Natjecatelj original) {
		this.ime = original.ime;
		this.duzina = original.duzina;
	}
	
	//Getteri i setteri
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzine(int duzina) {
		this.duzina = duzina;
	}
	
	
	public void trening(int x) {
		this.duzina+=x;
	}
	@Override 
	public String toString() {
		return "Ime "+ime+", Pretrčani kilometri "+duzina;
	}
}
