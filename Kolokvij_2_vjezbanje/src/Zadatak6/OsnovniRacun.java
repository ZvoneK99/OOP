package Zadatak6;

public abstract class OsnovniRacun implements Racun {
	private String imeVlasnika;
	protected double stanjeRacuna;
	
	public OsnovniRacun(String imeVlasnika, double stanjeRacuna) {
		this.setImeVlasnika(imeVlasnika);
		this.setStanjeRacuna(stanjeRacuna);
	}
	
	@Override
	public String dohvatiImeVlasnika() {
		return getImeVlasnika();
	}

	@Override
	public double provjeriStanjeRacuna() {
		return getStanjeRacuna();
	}

	@Override
	public boolean UplatiNovac(double iznos) {
		if(iznos<=0) {
			return false;
		}else {
			stanjeRacuna+=iznos;
			return true;
		}
	}

	@Override
	public boolean podigniNovac(double iznos) {
		if(stanjeRacuna< iznos) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
	@Override
	public String toString() {
		return "Ime vlasnika: "+getImeVlasnika()+" Stanje racuna "+getStanjeRacuna();
	}
}
