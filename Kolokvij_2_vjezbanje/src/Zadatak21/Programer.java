package Zadatak21;

public class Programer extends Zaposlenik implements RadniUcinak{
	private int brojLinijaKoda;
	private boolean jeFullStack;
	
	public Programer(int ID, String imePrezime, int godineIskustva, int brojLinijaKoda) {
		super(ID, imePrezime, godineIskustva);
		this.setBrojLinijaKoda(brojLinijaKoda);
		this.jeFullStack = brojLinijaKoda > 5000;
	}

	public int getBrojLinijaKoda() {
		return brojLinijaKoda;
	}

	public void setBrojLinijaKoda(int brojLinijaKoda) {
		this.brojLinijaKoda = brojLinijaKoda;
	}

	public boolean isJeFullStack() {
		return jeFullStack;
	}

	public void setJeFullStack(boolean jeFullStack) {
		this.jeFullStack = jeFullStack;
	}
	@Override
	public double izracunajBodove() {
		return brojLinijaKoda / 100 +(jeFullStack ? 10 : 0);
	}
	@Override
	public void prikaziUcinak() {
		System.out.println("Broj linija koda "+getBrojLinijaKoda()+" Fullstack? "+isJeFullStack());
	}
	@Override
	public String toString() {
		return super.toString()+" Broj linija koda "+getBrojLinijaKoda()+" Fullstack? "+isJeFullStack();
	}
}
