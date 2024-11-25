package primjer06;

public class AudioDatoteka extends MultimedijskaDatoteka {
	public int bitrate;
	private double trajanje;
	
	//Prazni konstruktor
	public AudioDatoteka() {
		super();
		this.bitrate = 128;
		this.trajanje = 0.0;
	}
	//Konstruktor sa svim atributima
	public AudioDatoteka(String naziv, double velicina, int bitrate, double trajanje) {
		super(naziv, velicina);
		this.bitrate = bitrate;
		this.trajanje = trajanje;
	}
	//Getter i setter za trajanje
	public double getTrajanje() {
		return this.trajanje;
	}
	public void setTrajanje(double trajanje) {
		this.trajanje = trajanje;
	}
	@Override
	public void ispisiDetalje() {
		super.ispisiDetalje();
		System.out.println("Bitrate: "+bitrate+" kbps, Trajanje: "+trajanje+" minuta.");
	}
}
