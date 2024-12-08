package zadatak4;

public abstract class DokumentKnjiznice implements Dokument {
	private int ID;
	private String nazivDokumenta;
	
	public DokumentKnjiznice(int ID, String nazivDokumenta) {
		this.ID = ID;
		this.nazivDokumenta = nazivDokumenta;
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getNazivDokumenta() {
		return this.nazivDokumenta;
	}
	public void setNazivDokumenta(String nazivDokumenta) {
		this.nazivDokumenta = nazivDokumenta;
	}
	  public abstract boolean jeLiPotrebanPolog();
	    public abstract double dajIznosPologa();

	    @Override
	  public String toString() {
	        return "ID: " + ID + ", Naziv: " + nazivDokumenta;
	    }
}
