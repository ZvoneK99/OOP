package Zadatak19;

public class Slika extends OsnovniEksponat{
	private String autor;
	
	public Slika(String naziv, int godine, String autor) {
		super(naziv, godine);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String vrstaEksponata() {
		return "Slika";
	}
	@Override
	public double vrijednostEksponata() {
		return (2023 - getGodina()) * 100;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Autor ").append(getAutor()).append(" Vrijednos eksponata: ").append(vrijednostEksponata());
		return sb.toString();
	}
}
