package zad2_novo;

public class Udzbenik extends Knjiga {
	private String predmet;
	
	public Udzbenik(int ID, String nazivDokumenta, String autor, String predmet) {
		super(ID, nazivDokumenta, autor);
		this.setPredmet(predmet);
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
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
	public int dajIznosPologa() {
		return 10;
	}
	@Override
	public String toString() {
		return  super.toString()+ "Predmet "+predmet;
	}
}
