package zad2;

public class Rijecnik extends Knjiga {
	private String prviJezik;
	private String drugiJezik;

	public Rijecnik(int ID, String nazivDokumenta, String autor) {
		super(ID, nazivDokumenta, autor);
	}
	
	//Getter i setter
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
	public String toString() {
		return super.toString()+" Prvi jezik: "+prviJezik+", Drugi jezik: "+drugiJezik+".";
	}
}
