package Zadatak4;

public class Automobil extends OsnovnoVozilo {
	private String tipAutomobila;
	private double potrosnja;
	
	public Automobil(String naziv, String tipAutomobila, double potrosnja) {
		super(naziv);
		this.setTipAutomobila(tipAutomobila);
		this.setPotrosnja(potrosnja);
	}

	//Getteri i setteri
	public String getTipAutomobila() {
		return tipAutomobila;
	}

	public void setTipAutomobila(String tipAutomobila) {
		this.tipAutomobila = tipAutomobila;
	}

	public double getPotrosnja() {
		return potrosnja;
	}

	public void setPotrosnja(double potrosnja) {
		this.potrosnja = potrosnja;
	}
	@Override
	public String toString() {
		return super.toString()+ " Tip automobila "+getTipAutomobila()+" Potrosnja "+getPotrosnja();
	}
}
