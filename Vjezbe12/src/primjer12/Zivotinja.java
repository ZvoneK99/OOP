package primjer12;

public abstract class Zivotinja {
	private String ime;
	
	public Zivotinja(String ime) {
		this.ime = ime;
	}
	public String getIme() {
		return this.ime;
	}
	public abstract void glasajSe();
	
	public void jedem() {
	}
	
	
}
