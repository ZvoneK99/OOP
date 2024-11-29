package primjer10;

public class Automobil extends Vozilo {
	int brojVrata;
	
	public Automobil(double maxBrzina, int brojVrata) {
		double novaMaxBrzina = maxBrzina*0.8;
		
		super(novaMaxBrzina);
		this.brojVrata = brojVrata;
	}
	@Override
	public String toString() {
		return "Brzina: "+brzina+", Max brzina: "+maxBrzina+", Broj vrata: "+brojVrata+"."; 
	}
}
