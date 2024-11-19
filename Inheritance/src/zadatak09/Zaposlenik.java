package zadatak09;

public class Zaposlenik extends Osoba {
	String pozicija;
	double plaća;
	
	public Zaposlenik(String ime, String prezime, int godinaRođenja, String pozicija, double plaća) {
		super(ime, prezime, godinaRođenja);
		this.pozicija = pozicija;
		this.plaća = plaća;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+", Godina rođenja: "+godinaRođenja+", Pozicija: "+pozicija+", Plaća: "+plaća+".");
	}
}
