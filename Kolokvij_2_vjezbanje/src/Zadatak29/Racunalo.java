package Zadatak29;

public abstract class Racunalo {
	private String model;
	private String proizvodjac;
	private String OS;
	
	public Racunalo(String model, String proizvodjac, String OS) {
		this.setModel(model);
		this.setProizvodjac(proizvodjac);
		this.setOS(OS);
	}

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

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	public abstract String dohvatiTipRacunala();
	public abstract int izracunajPrenosivost();
	
	@Override
	public String toString() {
		return "Model "+getModel()+" Proizvođač "+getProizvodjac()+" OS "+getOS()+" Tip računala "+dohvatiTipRacunala()+" Prenosivost "+izracunajPrenosivost(); 
	}
}
