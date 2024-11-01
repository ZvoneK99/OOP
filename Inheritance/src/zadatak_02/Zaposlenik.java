package zadatak_02;

public class Zaposlenik extends Osoba {
	String pozicija;
	
	public Zaposlenik(String ime, int godine, String pozicija) {
		super(ime, godine);
		this.pozicija = pozicija;
	}
	@Override 
	public void ispisiDetalje() {
		System.out.println("Ime osobe "+ime+" godine: "+godine+" i radi na poziciji: "+pozicija+".");
	}
}
