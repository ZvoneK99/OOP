package Zadatak;

public class Knjiga {
	String naslov;
	String autor;
	int brojStranica;
	boolean posudjena;
	
	public Knjiga(String naslov, String autor, int brojStranica, boolean posudjena) {
		this.naslov = naslov;
		this.autor = autor;
		this.brojStranica = brojStranica;
		this.posudjena = posudjena;
	}
	public Knjiga(Knjiga k1) {
		this.naslov = k1.naslov;
		this.autor = k1.autor;
		this.brojStranica = k1.brojStranica;
		this.posudjena = k1.posudjena;
	}
	public boolean posudiKnjigu() {
		return posudjena = true;
	}
	public boolean vratiKnjigu() {
		return posudjena = false;
	}
	
	@Override
	public String toString() {
		String stanje = posudjena ? "slobodna" : "zauzeta";
		return "Naslov "+naslov+"\n Autor "+autor+"\n Broj stranica "+brojStranica+"\n Stanje: "+stanje; 
	}
}
