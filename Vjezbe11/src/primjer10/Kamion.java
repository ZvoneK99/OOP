package primjer10;

public class Kamion extends Vozilo {
	double nosivost;
	
	public Kamion(double maxBrzina, double nosivost) {
	    double stvarnaMaxBrzina = (nosivost > 10) ? maxBrzina * 0.6 : maxBrzina;

	    super(stvarnaMaxBrzina);

	    this.nosivost = nosivost;
	}
	@Override
	public String toString() {
		return "Brzina: "+brzina+", Max brzina: "+maxBrzina+", Nosivost: "+nosivost+".";
	}

}
