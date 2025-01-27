package Zadatak30;

public class Udzbenik extends Knjiga {
	String predmet;
	
	public Udzbenik(int ID, String nazivDokumenta, String autor, String predmet) {
		super(ID, nazivDokumenta, autor);
		this.predmet = predmet;
	}

	@Override
	public int dajPeriodPosudbe() {
		return 120;
	}
	@Override
	public boolean jeLiPotrebanPolog() {
		return true;
	}
	@Override
	public double dajIznosPologa() {
		return 4;
	}
	@Override
	public String toString() {
		return super.toString()+" Predmet "+predmet;
	}
}
