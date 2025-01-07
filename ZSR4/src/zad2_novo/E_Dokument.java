package zad2_novo;

public class E_Dokument extends DokumentKnjiznice {
	private String podatkovniClan;
	
	public E_Dokument(int ID, String nazivDokumenta, String podatkovniClan) {
		super(ID, nazivDokumenta);
		this.setPodatkovniClan(podatkovniClan);
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
		return true;
	}

	@Override
	public int dajIznosPologa() {
		return 100;
	}
	@Override
	public String toString() {
		return  super.toString()+" Podatkovni clan "+podatkovniClan;
	}
}
