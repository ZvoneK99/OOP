package primjer02;

public class Kolegij {
	String nazivKolegija;
	int ECTS;
	
	public Kolegij(String nazivKolegija, int ECTS) {
		this.nazivKolegija = nazivKolegija;
		this.ECTS = ECTS;
	}
	public void ispisiDetaljeKolegija() {
		System.out.println("Naziv kolegija: "+nazivKolegija);
		System.out.println("ECTS bodovi: "+ECTS);
		System.out.println("-----------------");
	}
	public void ispisiImeKolegija() {
		System.out.println(nazivKolegija);
	}
	@Override
	public String toString() {
		return nazivKolegija+"("+ECTS+" ECTS)";
	}
}