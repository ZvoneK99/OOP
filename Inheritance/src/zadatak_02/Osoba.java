package zadatak_02;

public class Osoba {
	String ime;
	int godine;
	
	public Osoba(String ime, int godine) {
		this.ime = ime;
		this.godine = godine;
	}
	public void ispisiDetalje() {
		System.out.println("Ime osobe je "+ime+ " i ima "+godine+ " godina.");
	}
}
