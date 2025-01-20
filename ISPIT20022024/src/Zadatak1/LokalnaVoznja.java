package Zadatak1;

import java.util.ArrayList;

public class LokalnaVoznja extends Voznja {
	private ArrayList<String> drzaveKojimaProlazi;
	
	public LokalnaVoznja(String polaziste, String odrediste, double cijenaKarte, String modelAutobusa) {
		super(polaziste, odrediste, cijenaKarte, modelAutobusa);
		this.drzaveKojimaProlazi = new ArrayList<>();
		popuniPopisDrzava();
	}
	
	public void  drzaveKojimaProlazi() {
		
	}
	
	public void popuniPopisDrzava() {
		
	}
	@Override
	void ispisiPopisPutnika() {
		// TODO Auto-generated method stub

	}

	@Override
	String dajOsnovneInformacije() {
		// TODO Auto-generated method stub
		return null;
	}

}
