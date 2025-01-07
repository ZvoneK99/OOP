package zad2_novo;

public abstract class DokumentKnjiznice implements Dokument {
	private int ID;
	private String nazivDokumenta;
	
	public DokumentKnjiznice(int ID, String nazivDokumenta) {
		this.setID(ID);
		this.setNazivDokumenta(nazivDokumenta);
	}
	
	@Override
	public int dajPeriodPosudbe() {
		return 0;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNazivDokumenta() {
		return nazivDokumenta;
	}
	public void setNazivDokumenta(String nazivDokumenta) {
		this.nazivDokumenta = nazivDokumenta;
	}
	public abstract boolean jeLiPotrebanPolog();
	public abstract int dajIznosPologa();

@Override
public String toString() {
	return  "ID "+ID+" Naziv dokumenta "+nazivDokumenta;
}
}
