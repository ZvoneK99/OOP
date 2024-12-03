package primjer11;

public abstract class Zivotinja {
	protected String ime;
	public Zivotinja(String ime) {
		this.ime = ime;
	}
	public String getIme() {
		return this.ime;
	}
	
	public abstract void oglasiSe();
}
