package Zad2slicno2;

public abstract class OsnovnaKnjiga implements Knjiga {
	private String naslov;
	private String autor;
	private boolean dostupna;
	
	public OsnovnaKnjiga(String naslov, String autor) {
		this.naslov = naslov;
		this.autor = autor;
		this.dostupna = false;
	}
	@Override
	public String dohvatiNaslov() {
		return getNaslov();
	}

	@Override
	public String dohvatiAutora() {
		return getAutor();
	}

	@Override
	public boolean posudiKnjigu() {
		return dostupna = true;
	}

	@Override
	public boolean vratiKnjigu() {
		return false;
	}

	//Getteri i setteri
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDostupna() {
		return dostupna;
	}
	public void setDostupna(boolean dostupna) {
		this.dostupna = dostupna;
	}
	@Override
	public String toString() {
		return "Naslov: "+getNaslov()+" Autor: "+getAutor()+" Dostupna: "+isDostupna();
	}
}
