package Zadatak8;

public class DiplomskiStudent extends Student {
	private String zavrsniRadNaslov;
	
	public DiplomskiStudent(String ime, int godine, double prosjekOcjena, String zavrsniRadNaslov) {
		super(ime, godine, prosjekOcjena);
		this.zavrsniRadNaslov = zavrsniRadNaslov;
	}

	public String getZavrsniRadNaslov() {
		return zavrsniRadNaslov;
	}
	public void setZavrsniRadNaslov(String zavrsniRadNaslov) {
		this.zavrsniRadNaslov = zavrsniRadNaslov;
	}
	
	
	@Override
	public int polozeniECTS() {
		return 120;
	}
	@Override
	public String toString() {
		return super.toString()+ " Zavrsni rad: "+getZavrsniRadNaslov();
	}
}
