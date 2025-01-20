package Zadatak4;

public class Vozac {
	private String ime;
	private Vozilo vozilo;
	
	public Vozac(String ime, Vozilo vozilo) {
		this.ime = ime;
		this.vozilo = vozilo;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public Vozilo getVozilo() {
		return vozilo;
	}
	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}
	 public void ispisiPodatke() {
	        System.out.println("Vozač: " + ime);
	        System.out.println("Vozilo: " + vozilo);
	    }
}
