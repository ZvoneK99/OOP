package primjer_02;

public class Zivotinja {
	private String ime;
	private String vrsta;
	private int starost;

	public Zivotinja(String ime, String vrsta, int starost) {
		this.ime = ime;
		this.vrsta = vrsta;
		this.starost = starost;
	}
	
	//Getter i setter za ime
	public String getIme() {
		return this.ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	//Getter i setter za vrstu
	public String getVrsta() {
		return this.vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	//Getter i setter za starost
	public int getStarost() {
		return this.starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	public void oglasiSe() {
		System.out.println("Ova životinja se oglašava.");
	}
}