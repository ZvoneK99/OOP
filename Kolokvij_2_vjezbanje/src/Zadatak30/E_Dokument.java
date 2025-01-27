package Zadatak30;

public class E_Dokument extends DokumentKnjiznice {
	String podatkovniClan;
	
	public E_Dokument(int ID, String nazivDokumenta, String podatkovniClan) {
		super(ID, nazivDokumenta);
		this.podatkovniClan = podatkovniClan;
	}
	@Override
	public int dajPeriodPosudbe() {
		return 30;
	}
	@Override
	public boolean jeLiPotrebanPolog() {
		return true;
	}
	@Override
	public double dajIznosPologa() {
		return 14;
	}
	@Override
	public String toString() {
		return super.toString()+" Podatkovni clan "+podatkovniClan;
	}
}
