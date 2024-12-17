package ZSR4_1;

public abstract class Racunalo {
	private String model;
	private String proizvodjac;
	private String operacijskiSustav;
	
	public Racunalo(String model, String proizvodjac, String operacijskiSustav) {
		this.model = model;
		this.proizvodjac = proizvodjac;
		this.operacijskiSustav = operacijskiSustav;
	}
	//Getteri i setteri
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getOperacijskiSustav() {
		return operacijskiSustav;
	}
	public void setOperacijskiSustav(String operacijskiSustav) {
		this.operacijskiSustav = operacijskiSustav;
	}
	
	public abstract String dohvatiTipRacunala();
	public abstract int izracunajPrenosivost();
		
	public String toString() {
		return "Model "+model+", Proizvođač "+proizvodjac+", Operacijski sustav "+operacijskiSustav+".";
	}
}
