package Zadatak3;

public abstract class OsnovniUredaj implements Uredaj {
	private String naziv;
	private boolean ukljucen;
	
	public OsnovniUredaj(String naziv) {
		this.naziv = naziv;
		this.ukljucen = false;
	}
	
	@Override
	public String dohvatiNaziv() {
		return getNaziv();
	}

	@Override
	public boolean ukljuciUredaj() {
		return ukljucen = true;
	}

	@Override
	public boolean iskljuciUredaj() {
		return ukljucen = false;
	}

	@Override
	public boolean provjeriStanje() {
		return isUkljucen();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isUkljucen() {
		return ukljucen;
	}

	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	@Override
	public String toString() {
		return "Naziv: "+getNaziv()+" Ukljucen? "+isUkljucen();
	}
}
