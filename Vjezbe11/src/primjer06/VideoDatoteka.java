package primjer06;

public class VideoDatoteka extends MultimedijskaDatoteka {
	public String rezolucija;
	private double trajanje;
	
	//Prazni konstruktor
	public VideoDatoteka() {
		super();
		this.rezolucija = "1920x1080";
		this.trajanje = 0.0;
	}
	//Konstruktor sa parametrima
	public VideoDatoteka(String naziv, double velicina, String rezolucija, double trajanje) {
		super(naziv, velicina);
		this.rezolucija = rezolucija;
		this.trajanje = trajanje;
	}
	//Getter i setter za trajanje;
	public double getTrajanje() {
		return this.trajanje;
	}
	public void setTrajanje(double trajanje) {
		this.trajanje = trajanje;
	}
	@Override
	public void ispisiDetalje() {
		super.ispisiDetalje();
		System.out.println("Rezolucija datoteke: "+rezolucija+", Trajanje: "+trajanje+" minuta.");
	}
	
}
