package zadatak1;

public abstract class Oblik {
	protected String naziv;
	
	public Oblik(String naziv) {
		this.naziv = naziv;
	}
	
	public abstract double izračunajPovršinu();
	
	public abstract double izračunajOpseg();
	
	public String getNaziv() {
		return this.naziv;
	}
}
