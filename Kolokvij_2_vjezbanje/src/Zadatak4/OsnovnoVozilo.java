package Zadatak4;

public abstract class OsnovnoVozilo implements Vozilo{
	private String naziv;
	private boolean stanje;
	
	public OsnovnoVozilo(String naziv) {
		this.setNaziv(naziv);
		this.setStanje(false);
	}
	@Override
	public String dohvatiNaziv() {
		return getNaziv();
	}
	
	@Override
	public boolean pokreniVozilo() {
		return stanje = true;
	}
	
	@Override 
	public boolean zaustaviVozilo() {
		return stanje = true;
	}
	
	//Getter i setter
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public boolean isStanje() {
		return stanje;
	}
	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}
	@Override
	public String toString() {
		return "Naziv "+getNaziv()+" Stanje: "+isStanje();
	}
}
