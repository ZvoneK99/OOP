package projekt_05;

public class DokumentarniFilm extends Film {
	private int trajanje;
	
	public DokumentarniFilm(String naslov, String zanr, int godinaIzdanja, boolean dostupan, int trajanje) {
		super(naslov, zanr, godinaIzdanja, dostupan);
		this.trajanje = trajanje;
	}
	public int getTrajanje() {
		return this.trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	@Override
	public void ispisiDetalje() {
		String stanje = getDostupan() ? "dostupan" : "nedostupan";
		System.out.println("--Detalji o dokumentarnom filmu--");
		System.out.println("Naslov: "+getNaslov());
		System.out.println("Zanr: "+getZanr());
		System.out.println("Godina izdanja: "+getGodinaIzdanja());
		System.out.println("Film je trenutno: "+stanje);
		System.out.println("Trajanje filma u minutama: "+trajanje);
	}
}
