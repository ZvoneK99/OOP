package zad2;

public class E_Dokument extends DokumentKnjiznice {
	private String podatkovniClan;

	public E_Dokument(int ID, String nazivDokumenta, String podatkovniClan) {
		super(ID, nazivDokumenta);
		this.podatkovniClan = podatkovniClan;
	}
	
	public String getPodatkovniClan() {
		return podatkovniClan;
	}

	public void setPodatkovniClan(String podatkovniClan) {
		this.podatkovniClan = podatkovniClan;
	}
	@Override
	public int dajPeriodPosudbe() {
		return 30;
	}

	@Override
	public boolean jeLiPotrebanPolog() {
		return false;
	}

	@Override
	public int dajIznosPologa() {
		return 22;
	}
	@Override
	public String toString() {
		return super.toString()+" Podatkovni clan: "+podatkovniClan+".";
	}
}
