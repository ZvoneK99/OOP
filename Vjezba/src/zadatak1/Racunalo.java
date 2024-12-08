package zadatak1;

public class Racunalo {
	private String model;
	private String proizvodjac;
	private double cijena;
	
	public Racunalo(String model, String proizvodjac, double cijena) {
		this.model = model;
		this.proizvodjac = proizvodjac;
		this.cijena = cijena;
	}
	//Getteri i setteri
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProizvodjac() {
		return this.proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public double getCijena() {
		return this.cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public void prikaziDetalje() {
		 System.out.println("Racunalo: " + model + ", Proizvođač: " + proizvodjac + ", Cijena: " + cijena + " EUR");
	}
	
	
}	
