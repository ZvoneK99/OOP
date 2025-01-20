package Zadatak7;

import java.util.ArrayList;

public class Projekt {
	private String naziv;
	private ArrayList<Zaposlenik> zaposlenici;
	
	public Projekt(String naziv) {
		this.naziv = naziv;
		this.zaposlenici = new ArrayList<Zaposlenik>();
	}
	
	//getteri i setteri
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public ArrayList<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}
	public void setZaposlenici(ArrayList<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}
	
	public void dodajZaposlenika(Zaposlenik z) {
		zaposlenici.add(z);
	}
}
