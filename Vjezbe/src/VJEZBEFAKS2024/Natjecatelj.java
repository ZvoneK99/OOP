package VJEZBEFAKS2024;

public abstract class Natjecatelj implements Prijava {
	private int duzina;
	private String ime;
	
	public Natjecatelj( String ime, int duzina) {
		this.ime = ime;
		this.duzina = duzina;
	}
	
	public Natjecatelj(Natjecatelj n) {
		this.duzina = n.duzina;
		this.ime = n.ime;
	}
	
	public void trening(int x) {
		this.setDuzina(this.getDuzina() + x);
	}

	//Getteri i setteri
	public int getDuzina() {
		return duzina;
	}

	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String toString() {
		return "Ime "+ime+", Pretrcani kilometri "+duzina; 
	}
}
