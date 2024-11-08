package primjer10;

public class Polaznik {
	private String ime;
	private String prezime;
	private int brojPolaznika;
	
	public Polaznik(String ime, String prezime, int brojPolaznika) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojPolaznika = brojPolaznika;
	}
	//Getteri i setteri
	public String getIme() {
		return this.ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojPolaznika() {
		return this.brojPolaznika;
	}
	public void setBrojPolaznika(int brojaPolaznika) {
		this.brojPolaznika = brojPolaznika;
	}
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Jedinstveni ID polaznika: "+brojPolaznika);
	}
}
