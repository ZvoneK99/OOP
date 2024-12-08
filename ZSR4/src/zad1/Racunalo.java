package zad1;

public abstract class Racunalo {
	private String model;
	private String proizvodjac;
	private String operacijskiSustav;
	
	public Racunalo(String model, String proizvodjac, String  operacijskiSustav) {
		this.setModel(model);
		this.setProizvodjac(proizvodjac);
		this.setOperacijskiSustav(operacijskiSustav);
	}
	
	public abstract String dohvatiTipRacunala();
	public abstract int izracunajPrenosivost();

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
	
	public String toString() {
		return "Model; "+model+", Proizvođač: "+proizvodjac+", Operacijski sustav: "+operacijskiSustav+".";
	}
}
