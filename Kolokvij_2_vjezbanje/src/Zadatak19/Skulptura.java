package Zadatak19;

public class Skulptura extends OsnovniEksponat{
	private String materijal;
	
	public Skulptura(String naziv, int godina, String materijal) {
		super(naziv, godina);
		this.materijal = materijal;
	}
	
	public String getMaterijal() {
		return materijal;
	}
	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	
	@Override
	public String vrstaEksponata() {
		return "Skulptura";
	}
	@Override
	public double vrijednostEksponata() {
		return (2023 - getGodina()) * 200;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Materijal ").append(getMaterijal()).append(" Vrijednos eksponata: ").append(vrijednostEksponata());
		return sb.toString();
	}
}
