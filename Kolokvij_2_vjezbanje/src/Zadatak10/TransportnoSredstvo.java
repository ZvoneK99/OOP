package Zadatak10;

public abstract class TransportnoSredstvo {
	private int ID;
	private String naziv;
	
	public TransportnoSredstvo(int ID, String naziv) {
		this.setID(ID);
		this.setNaziv(naziv);
	}
	
	public abstract double izracunajUkupnuTezinu();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return "ID "+getID()+" Naziv: "+getNaziv(); 
	}
}
