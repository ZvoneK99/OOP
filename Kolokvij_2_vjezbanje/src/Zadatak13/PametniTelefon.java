package Zadatak13;

public class PametniTelefon implements Punjenje, WiFi {
	int baterija;
	String povezanMreza;
	
	public PametniTelefon() {
		this.baterija = 30;
		this.povezanMreza = null;
	}
	
	@Override
	public void poveziNaWiFi(String mreza) {
		povezanMreza = mreza;
		System.out.println("Povezan je na mrezu: "+mreza);
	}

	@Override
	public boolean provjeriPovezanost() {
		return povezanMreza != null;
	}

	@Override
	public void napuniBateriju(int postotak) {
		if(baterija <  100) {
			baterija+=postotak;
			if(baterija>100) {
				baterija = 100;
			}
			System.out.println("Stanje baterije: "+baterija+"%");
		}
		else {
			System.out.println("Baterija je puna:");
		}
	}

	@Override
	public int provjeriBateriju() {
		return baterija;
	}

}
