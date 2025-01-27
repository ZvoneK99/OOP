package Zadatak30;

public class Rijecnik extends Knjiga {
	String prviJezik;
	String drugiJezik;
	
	public Rijecnik(int ID, String nazivDokumenta, String autor, String prviJezik, String drugiJezik) {
		super(ID, nazivDokumenta, autor);
		this.prviJezik = prviJezik;
		this.drugiJezik = drugiJezik;
	}
	@Override
	public String toString() {
		return super.toString()+" Prvi jezik "+prviJezik+" Drugi jezik "+drugiJezik;
	}
}
