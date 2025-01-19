package Zad2slicno2;

public class NaucnaKnjiga extends OsnovnaKnjiga {
	private String podrucjeIstrazivanja;
	private int brojCitata;
	
	public NaucnaKnjiga(String naslov, String autor, String podrucjeIstrazivanja, int brojCitata) {
		super(naslov, autor);
		this.setPodrucjeIstrazivanja(podrucjeIstrazivanja);
		this.setBrojCitata(brojCitata);
	}
	
	//Getteri i setteri
	public String getPodrucjeIstrazivanja() {
		return podrucjeIstrazivanja;
	}
	public void setPodrucjeIstrazivanja(String podrucjeIstrazivanja) {
		this.podrucjeIstrazivanja = podrucjeIstrazivanja;
	}
	public int getBrojCitata() {
		return brojCitata;
	}
	public void setBrojCitata(int brojCitata) {
		this.brojCitata = brojCitata;
	}
	@Override
	public String toString() {
		return super.toString()+" Podrucje istrazivanja: "+getPodrucjeIstrazivanja()+" Broj citata: "+getBrojCitata();
	}
}
