package primjer06;

import java.util.ArrayList;

public class Zaposlenik {
	String ime;
	String prezime;
	int brojZaposlenika;
	ArrayList<String> projekti;
	
	public Zaposlenik(String ime, String prezime, int brojZaposlenika) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojZaposlenika = brojZaposlenika;
		this.projekti = new ArrayList<>();
	}
	public void dodajProjekt(String projekt) {
		projekti.add(projekt);
	}
	public void ispisiDetalje() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Broj zaposlenika: "+brojZaposlenika);
		System.out.println("Projekti na kojima radi: "+projekti);
	}
	public int getBrojZaposlenika() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getIme() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPrezime() {
		// TODO Auto-generated method stub
		return null;
	}
}
