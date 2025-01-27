package Zadatak12;

import java.util.ArrayList;

public class Odjel {
	private String naziv;
	private ArrayList<Zaposlenik> zaposlenici;
	private ArrayList<Pacijent> pacijenti;
	
	public Odjel(String naziv) {
		this.setNaziv(naziv);
		this.setZaposlenici(new ArrayList<Zaposlenik>());
		this.setPacijenti(new ArrayList<Pacijent>());
	}

	public void dodajZaposlenika(Zaposlenik z) {
		zaposlenici.add(z);
	}
	public void dodajPacijenta(Pacijent p) {
		pacijenti.add(p);
	}
	public void ispisZaposlenika() {
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z);
		}
	}
	public void ispisPacijenata() {
		for(Pacijent p : pacijenti) {
			System.out.println(p);
		}
	}
	public double ukupniTroskoviPlaca() {
		double ukupnaPlaca=0;
		for(Zaposlenik z : zaposlenici) {
			ukupnaPlaca +=z.getPlaca();
		}
		return ukupnaPlaca;
	}
	
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

	public ArrayList<Pacijent> getPacijenti() {
		return pacijenti;
	}

	public void setPacijenti(ArrayList<Pacijent> pacijenti) {
		this.pacijenti = pacijenti;
	}

	public void ispisiZaposlenike() {
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z);
		}
	}

	public void ispisiPacijente() {
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z);
		}
	}
}
