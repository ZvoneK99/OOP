package Zadatak3;

public class PametniTelefon extends OsnovniUredaj {
	private String operativniSustav;
	private int kapacitetBaterije;
	
	public PametniTelefon(String naziv, String operativniSustav, int kapacitetBaterije) {
		super(naziv);
		this.operativniSustav = operativniSustav;
		this.kapacitetBaterije = kapacitetBaterije;
	}

	
	public String getOperativniSustav() {
		return operativniSustav;
	}
	public void setOperativniSustav(String operativniSustav) {
		this.operativniSustav = operativniSustav;
	}
	public int getKapacitetBaterije() {
		return kapacitetBaterije;
	}
	public void setKapacitetBaterije(int kapacitetBaterije) {
		this.kapacitetBaterije = kapacitetBaterije;
	}
	@Override
	public String toString() {
		return super.toString()+" OS: "+getOperativniSustav()+" Kapacitet baterije: "+getKapacitetBaterije();
	}
}
