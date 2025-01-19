package Zad2slicno2;

public class Beletristika extends OsnovnaKnjiga {
	private String zanr;
	private int brojStranica;
	
	public Beletristika(String naslov, String autor, String zanr, int brojStranica) {
		super(naslov, autor);
		this.zanr = zanr;
		this.brojStranica = brojStranica;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public int getBrojStranica() {
		return brojStranica;
	}

	public void setBrojStranica(int brojStranica) {
		this.brojStranica = brojStranica;
	}
	@Override
	public String toString() {
		return super.toString()+" Zanr: "+getZanr()+", Broj stranica: "+getBrojStranica();
	}
}
