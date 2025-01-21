package Zadatak9;

public abstract class Zivotinja {
	private int ID;
	private String vrsta;
	
	public Zivotinja(int ID, String vrsta) {
		this.ID = ID;
		this.vrsta = vrsta;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public abstract double dohvatiTezinu();
	
	public final boolean jeLiTezinaPrekoracena() {
		if(dohvatiTezinu() > 50) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "ID: "+getID()+" Vrsta: "+getVrsta();
	}
}
