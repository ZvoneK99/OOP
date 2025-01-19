package Zad2slicno;

public abstract class OsnovniUredjaj implements Uredjaj {
	private String nazivUredjaja;
	private boolean stanjeUredjaja;
	
	public OsnovniUredjaj(String nazivUredjaja, boolean stanjeUredjaja) {
		this.nazivUredjaja = nazivUredjaja;
		this.stanjeUredjaja = stanjeUredjaja;
	}
	
	public String getNazivUredjaja() {
		return nazivUredjaja;
	}
	public void setNazivUredjaja(String nazivUredjaja) {
		this.nazivUredjaja = nazivUredjaja;
	}
	public boolean getStanjeUredjaja() {
		return stanjeUredjaja;
	}
	public void setStanjeUredjaja(boolean stanjeUredjaja) {
		this.stanjeUredjaja = stanjeUredjaja;
	}
	
	public boolean ukljuciUredjaj() {
		return stanjeUredjaja = true;
	}
	public boolean iskljuciUredjaj() {
		return stanjeUredjaja = false;
	}
	@Override
	public String toString() {
		return "Naziv uređaja "+getNazivUredjaja()+" stanje uređaja: "+getStanjeUredjaja();  
	}
}
