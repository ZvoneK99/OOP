package projekt_05;

public class Film {
	private String naslov;
	private String zanr;
	private int godinaIzdanja;
	private boolean dostupan;
	
	public Film(String naslov, String zanr, int godinaIzdanja, boolean dostupan) {
		this.naslov = naslov;
		this.zanr = zanr;
		this.godinaIzdanja  = godinaIzdanja;
		this.dostupan = dostupan;
	}
	public String getNaslov() {
		return this.naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getZanr() {
		return this.zanr;
	}
	public void setZanr(String zanr) {
		this.zanr = zanr;
	}
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	public boolean getDostupan() {
		return this.dostupan;
	}
	public void setDostupan(boolean dostupan) {
		this.dostupan = dostupan;
	}
	
	public void posudiFilm() {
		if(dostupan) {
			dostupan = true;
			System.out.println("Posudili ste film.");
		}
		else {
			System.out.println("Nazalost, film je vec posuđen");
		}
	}
	public void vratiFilm() {
		if(!dostupan) {
			dostupan = true;
			System.out.println("Uspješno ste vratili film.");
		}
	}
	public void ispisiDetalje() {
		String stanje = dostupan ? "dostupan" : "nedostupan";
		System.out.println("--Detalji o filmu--");
		System.out.println("Naslov: "+naslov);
		System.out.println("Zanr: "+zanr);
		System.out.println("Godina izdanja: "+godinaIzdanja);
		System.out.println("Film je trenutno: "+stanje);
	}
}

