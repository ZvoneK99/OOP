package zadatak7;

public class Laptop extends Racunalo {
	private int trajanjeBaterije;
	
	public Laptop(String proizvodjac, String model, String procesor, int ram, int trajanjeBaterije) {
		super(proizvodjac, model, procesor, ram);
		this.setTrajanjeBaterije(trajanjeBaterije);
	}

	public int getTrajanjeBaterije() {
		return trajanjeBaterije;
	}

	public void setTrajanjeBaterije(int trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}
	@Override
	public String ispisiDetalje() {
		return super.ispisiDetalje()+", Trajanje baterije: "+trajanjeBaterije+" sati.";
	}
	
}
