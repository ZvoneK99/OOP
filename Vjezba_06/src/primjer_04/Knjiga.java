package primjer_04;

public class Knjiga {
	private String naslov;
	private String autor;
	private int godinaIzdanja;
	private boolean dostupna;
	
	public Knjiga(String naslov, String autor, int godinaIzdanja, boolean dostupna) {
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
		this.dostupna = dostupna;
	}
	
	public String getNaslov() {
		return this.naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	public void setGodinaizdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	public boolean getDostupna() {
		return this.dostupna;
	}
	public void setDostupna(boolean dostupna) {
		this.dostupna = dostupna;
	}
	public void ispisiDetalje() {
		
		String stanje = dostupna ? "Dostupna" : "Nedostupna";
		System.out.println("-----Detalji knjige-----");
		System.out.println("Naslov knjige: "+naslov);
		System.out.println("Autor: "+autor);
		System.out.println("Godina izdanja: "+godinaIzdanja);
		System.out.println("Knjiga je trenutno: "+stanje);
	}
}
