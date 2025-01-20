package Zadatak6;

public class TekuciRacun extends OsnovniRacun {
	private double prekoracenje;
	
	public TekuciRacun(String imeVlasnika, double stanjeRacuna, double prekoracenje) {
		super(imeVlasnika, stanjeRacuna);
		this.prekoracenje = prekoracenje;
	}
	@Override
	public boolean podigniNovac(double iznos) {
		double stanjePrekoracenje= getStanjeRacuna()+prekoracenje;
		if(stanjePrekoracenje<iznos) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public double getPrekoracenje() {
		return prekoracenje;
	}
	public void setPrekoracenje(double prekoracenje) {
		this.prekoracenje = prekoracenje;
	}
	@Override
	public String toString() {
		return super.toString()+" Prekoracenje: "+getPrekoracenje();
	}
 }
