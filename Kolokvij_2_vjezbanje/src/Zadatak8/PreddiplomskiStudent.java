package Zadatak8;

public class PreddiplomskiStudent extends Student {
	private int godinaStudija;
	
	public PreddiplomskiStudent(String ime, int godine, double prosjekOcjena, int godinaStudija) {
		super(ime, godine, prosjekOcjena);
		this.godinaStudija = godinaStudija;
	}
	
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	@Override
	public int polozeniECTS() {
		return godinaStudija * 60;
	}
	@Override
	public String toString() {
		return super.toString()+ " Godina studija: "+getGodinaStudija();
	}
}
