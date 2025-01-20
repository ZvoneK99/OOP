package Zadatak4;

public class Motocikl extends OsnovnoVozilo {
	private String tipMotocikla;
	private int brzina;
		
	public Motocikl(String naziv, String tipMotocikla, int brzina) {
		super(naziv);
		this.setTipMotocikla(tipMotocikla);
		this.setBrzina(brzina);
	}
	//Getter i setter
	public String getTipMotocikla() {
		return tipMotocikla;
	}

	public void setTipMotocikla(String tipMotocikla) {
		this.tipMotocikla = tipMotocikla;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}
	@Override
	public String toString() {
		return super.toString()+" Tip motocikla "+getTipMotocikla()+ " Brzina "+getBrzina();
	}
}
