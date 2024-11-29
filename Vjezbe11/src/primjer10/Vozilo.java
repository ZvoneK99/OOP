package primjer10;

public class Vozilo {
	double brzina;
	double maxBrzina;
	static int brojacVozila=1;
	int redniBrojVozila;
	
	public Vozilo(double maxBrzina) {
		this.brzina = 0;
		this.redniBrojVozila = brojacVozila;
	}
	  public double getMaxBrzina() {
	        return maxBrzina;
	    }

	    public double getBrzina() {
	        return brzina;
	    }
	
	public void ubrzaj(double iznos) {
		if(brzina+iznos<maxBrzina) {
			brzina+=iznos;
		}
		else {
			brzina = maxBrzina;
		}
	}
	public String toString() {
		return "Brzina: "+brzina+", Max brzina: "+maxBrzina+".";
	}
}
