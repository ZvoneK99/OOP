package Zadatak8;

public class DoktorskiStudent extends Student {
	private int brojRadova;
	
	public DoktorskiStudent(String ime, int godine, double prosjekOcjena, int brojRadova) {
		super(ime, godine, prosjekOcjena);
		this.setBrojRadova(brojRadova);
	}

	public int getBrojRadova() {
		return brojRadova;
	}

	public void setBrojRadova(int brojRadova) {
		this.brojRadova = brojRadova;
	}
	
	@Override
	public int polozeniECTS() {
		return brojRadova * 10;
	}
	@Override
	public String toString() {
		return super.toString()+ " Broj radova; "+getBrojRadova();
	}
	

}
