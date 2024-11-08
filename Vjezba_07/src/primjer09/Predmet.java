package primjer09;

public class Predmet {
	String naziv;
	int ectsBodovi;
	
	public Predmet(String naziv, int ectsBodovi) {
		this.naziv = naziv;
		this.ectsBodovi = ectsBodovi;
	}
	
	public void ispisiDetalje() {
		System.out.println("Naziv predmeta: "+naziv);
		System.out.println("Ects Boddovi: "+ectsBodovi);
	}
	@Override
	public String toString() {
	    return "Naziv: " + naziv + ", ECTS bodovi: " + ectsBodovi;
	}

}
