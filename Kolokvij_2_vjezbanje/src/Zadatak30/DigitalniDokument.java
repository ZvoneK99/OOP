package Zadatak30;

public class DigitalniDokument extends DokumentKnjiznice {
	String tip;
	
	public DigitalniDokument(int ID, String nazivDokumenta, String tip) {
		super(ID, nazivDokumenta);
		this.tip = tip;
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
		return 10;
	}
	@Override
	public String toString() {
		return super.toString()+" Tip "+tip;
	}
}
