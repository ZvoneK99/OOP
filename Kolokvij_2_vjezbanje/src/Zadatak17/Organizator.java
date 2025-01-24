package Zadatak17;

public class Organizator extends Osoba implements Natjecanje{
	private int brojOrganiziranihNatjecanja;
	private double uspjesnost;
	
	public Organizator(int ID, String imePrezime, int brojOrganiziranihNatjecanja, double uspjesnost) {
		super(ID, imePrezime);
		this.setBrojOrganiziranihNatjecanja(brojOrganiziranihNatjecanja);
		this.setUspjesnost(uspjesnost);
	}

	@Override
	public double izracunajRezultat() {
		return brojOrganiziranihNatjecanja * uspjesnost / 100;
	}
	
	//getteri i setteri
	public int getBrojOrganiziranihNatjecanja() {
		return brojOrganiziranihNatjecanja;
	}

	public void setBrojOrganiziranihNatjecanja(int brojOrganiziranihNatjecanja) {
		this.brojOrganiziranihNatjecanja = brojOrganiziranihNatjecanja;
	}

	public double getUspjesnost() {
		return uspjesnost;
	}

	public void setUspjesnost(double uspjesnost) {
		this.uspjesnost = uspjesnost;
	}
	@Override
	public void prikaziDetalje() {
		StringBuilder sb = new StringBuilder();
		super.prikaziDetalje();
		sb.append("Ime ").append(getImePrezime()).append("Broj natjecanja").append(getBrojOrganiziranihNatjecanja()).append("Uspjesnost").append(getUspjesnost());
		System.out.println(sb);
	}
}
