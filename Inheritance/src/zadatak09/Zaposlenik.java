package zadatak09;

import java.util.Calendar;

public class Zaposlenik extends Osoba {
	String pozicija;
	double plaća;
	int godinaZaposlenja;
	public Zaposlenik(String ime, String prezime, int godinaRođenja, String pozicija, double plaća, int godinaZaposlenja) {
		super(ime, prezime, godinaRođenja);
		this.pozicija = pozicija;
		this.plaća = plaća;
		this.godinaZaposlenja = godinaZaposlenja;
	}
	public boolean jeLiVisokPlaceni(double prag) {
		return plaća>prag;
	}
	public int izracunajStaz() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int staz = trenutnaGodina-godinaZaposlenja;
		return staz;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+", Godina rođenja: "+godinaRođenja+", Pozicija: "+pozicija+", Plaća: "+plaća+".");
	}
	public void ispisiImePrezime() {
		System.out.println(ime+" "+prezime);
	}
}
