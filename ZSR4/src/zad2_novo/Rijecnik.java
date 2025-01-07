package zad2_novo;

public class Rijecnik extends Knjiga {
	private String prviJezik;
	private String drugiJezik;
	
	public Rijecnik(int ID, String nazivDokumenta, String autor, String prviJezik, String drugiJezik) {
		super(ID, nazivDokumenta, autor);
		this.setPrviJezik(prviJezik);
		this.setDrugiJezik(drugiJezik);
	}

	public String getPrviJezik() {
		return prviJezik;
	}

	public void setPrviJezik(String prviJezik) {
		this.prviJezik = prviJezik;
	}

	public String getDrugiJezik() {
		return drugiJezik;
	}

	public void setDrugiJezik(String drugiJezik) {
		this.drugiJezik = drugiJezik;
	}
	@Override
	public boolean jeLiPotrebanPolog() {
		return false;
	}

	@Override
	public int dajIznosPologa() {
		return 110;
	}
	@Override
	public String toString() {
		return  super.toString()+" Prvi jezik "+prviJezik+" Drugi jezik " +drugiJezik;
	}
}
