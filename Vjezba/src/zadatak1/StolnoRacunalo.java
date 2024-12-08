package zadatak1;

public class StolnoRacunalo extends Racunalo {
	private int snagaNapajanja;
	
	public StolnoRacunalo(String model, String proizvodjac, double cijena, int snagaNapajanja) {
		super(model, proizvodjac, cijena);
		this.snagaNapajanja = snagaNapajanja;
	}
	public int getSnagaNapajanja() {
		return this.snagaNapajanja;
	}
	public void setSnagaNapajanja(int snagaNapajanja) {
		this.snagaNapajanja = snagaNapajanja;
	}
	@Override
	public void prikaziDetalje() {
		System.out.println("Racunalo: " + getModel() + ", Proizvođač: " + getProizvodjac() + ", Cijena: " + getCijena() + " EUR"+
	 			", Snaga napajanja: "+getSnagaNapajanja()+" W.");
	}
}
