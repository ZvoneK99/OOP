package Zad2;

public class TeretnoVozilo implements Vozilo {
	double nosivost;
	public TeretnoVozilo(double nosivost) {
		this.nosivost = nosivost;
	}
	
	@Override
	public String dohvatiTipVozila() {
		return "Teretno vozilo";
	}
	 @Override
	    public String toString() {
	        return "Teretno vozilo, Nosivost: " + nosivost + " tona";
	    }
}
