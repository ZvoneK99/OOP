package zad2;

public abstract class DokumentKnjiznice implements Dokument{
	private int ID;
	private String nazivDokumenta;
	
	public DokumentKnjiznice(int ID, String nazivDokumenta) {
		this.ID = ID;
		this.nazivDokumenta = nazivDokumenta;
	}
	
	//Getter i setter
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNazivDokumenta() {
		return this.nazivDokumenta;
	}
	public void setNazivDokumenta(String nazivDokumenta) {
		this.nazivDokumenta = nazivDokumenta;
	}
	
	@Override
	public int dajPeriodPosudbe() {
		return 0;
	}
	public abstract boolean jeLiPotrebanPolog();
	public abstract int dajIznosPologa();
	
	public String toString() {
		return "ID: "+ID+", Naziv dokumenta: "+nazivDokumenta+".";
	}
}
