package zadatak1;

public class Laptop extends Racunalo {
	private int baterijaTrajanje;
	
	public Laptop(String model, String proizvodjac, double cijena, int baterijaTrajanje) {
		super(model, proizvodjac, cijena);
		this.baterijaTrajanje = baterijaTrajanje;
	}
	
	public int getBaterijaTrajanje() {
		return this.baterijaTrajanje;
	}
	public void setBaterijaTrajanje(int baterijaTrajanje) {
		this.baterijaTrajanje = baterijaTrajanje;
	}
	@Override 
	public void prikaziDetalje() {
		 System.out.println("Racunalo: " + getModel() + ", Proizvođač: " + getProizvodjac() + ", Cijena: " + getCijena() + " EUR"+
				 			", Trajanje baterije: "+getBaterijaTrajanje()+" sati.");
	}
}
