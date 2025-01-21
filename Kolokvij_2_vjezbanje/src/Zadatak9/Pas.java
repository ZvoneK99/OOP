package Zadatak9;

public class Pas extends Zivotinja {
	private int brojIzvrsenihZadataka;
	private double tezinaPsa;
	
	public Pas(int ID, String vrsta, int brojIzvrsenihZadataka, double tezinaPsa) {
		super(ID, vrsta);
		this.setBrojIzvrsenihZadataka(brojIzvrsenihZadataka);
		this.setTezinaPsa(tezinaPsa);
	}
	
	@Override
	public double dohvatiTezinu() {
		return tezinaPsa;
	}
	public int getBrojIzvrsenihZadataka() {
		return brojIzvrsenihZadataka;
	}
	public void setBrojIzvrsenihZadataka(int brojIzvrsenihZadataka) {
		this.brojIzvrsenihZadataka = brojIzvrsenihZadataka;
	}
	public double getTezinaPsa() {
		return tezinaPsa;
	}
	public void setTezinaPsa(double tezinaPsa) {
		this.tezinaPsa = tezinaPsa;
	}
	@Override
	public String toString() {
		return super.toString()+" Broj izvrsenih zadataka: "+getBrojIzvrsenihZadataka()+" Tezina psa: "+dohvatiTezinu(); 
	}
}
