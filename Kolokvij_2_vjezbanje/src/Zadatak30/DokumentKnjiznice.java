package Zadatak30;

public abstract class DokumentKnjiznice implements Dokument{
	int ID;
	String nazivDokumenta;
	
	public DokumentKnjiznice(int ID, String nazivDokumenta) {
		this.ID = ID;
		this.nazivDokumenta = nazivDokumenta;
	}
	
	@Override
	public int dajPeriodPosudbe() {
		return 0;
	}
	public abstract boolean jeLiPotrebanPolog();
	public abstract double dajIznosPologa();
	
	@Override
	public String toString() {
		return "ID "+ID+" Naziv dokumenta "+nazivDokumenta+" Polog? "+jeLiPotrebanPolog()+" Iznos pologa "+dajIznosPologa();
	}
}
