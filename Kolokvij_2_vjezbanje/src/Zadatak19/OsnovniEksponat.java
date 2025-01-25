package Zadatak19;

public abstract class OsnovniEksponat implements Eksponat{
	private String naziv;
	private int godina;
	
	public OsnovniEksponat(String naziv, int godina) {
		this.naziv = naziv;
		this.godina = godina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Naziv ").append(getNaziv()).append(" Godina ").append(getGodina());
		return sb.toString();
	}
	
}
