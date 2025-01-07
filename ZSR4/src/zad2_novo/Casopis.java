package zad2_novo;

public class Casopis extends DokumentKnjiznice {
	private String kategorijaSadrzaja;
	private int izdanje;
	
	public Casopis(int ID, String nazivDokumenta, String kategorijaSadrzaja, int izdanje) {
		super(ID, nazivDokumenta);
		this.setKategorijaSadrzaja(kategorijaSadrzaja);
		this.setIzdanje(izdanje);
	}

	public String getKategorijaSadrzaja() {
		return kategorijaSadrzaja;
	}

	public void setKategorijaSadrzaja(String kategorijaSadrzaja) {
		this.kategorijaSadrzaja = kategorijaSadrzaja;
	}

	public int getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	@Override
	public int dajPeriodPosudbe() {
		return 7;
	}

	@Override
	public boolean jeLiPotrebanPolog() {
		return false;
	}

	@Override
	public int dajIznosPologa() {
		return 1240;
	}
	@Override
	public String toString() {
		return  super.toString()+ " Kategorija sadrzaja "+kategorijaSadrzaja+" Izdanje "+izdanje;
	}
}
