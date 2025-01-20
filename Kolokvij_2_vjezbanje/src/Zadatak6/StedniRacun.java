package Zadatak6;

public class StedniRacun extends OsnovniRacun {
	private double kamata;
	
	
	public StedniRacun(String imeVlasnika, double stanjeRacuna, double kamata) {
		super(imeVlasnika, stanjeRacuna);
		this.kamata = kamata;
	}

	public void primjeniKamatu() {
		stanjeRacuna += getStanjeRacuna()* (kamata / 100);

	}
	
	public double getKamata() {
		return kamata;
	}


	public void setKamata(double kamata) {
		this.kamata = kamata;
	}
	@Override
	public String toString() {
		return super.toString() + " Kamata: "+getKamata();
	}
}
