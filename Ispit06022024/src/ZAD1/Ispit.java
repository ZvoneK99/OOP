package ZAD1;

public abstract class Ispit implements Ocjenjivanje {
	private String predmet;
	private String nastavnik;
	private String datumVrijemeIspita;
	private static int[] pismeniIspit;
	private static int[] usmeniIspit;
	
	public Ispit(String predmet, String nastavnik, String datumVrijemeIspita) {
		this.predmet = predmet;
		this.nastavnik = nastavnik;
		this.datumVrijemeIspita = datumVrijemeIspita;
		pismeniIspit = new int[0];
		usmeniIspit = new int[0];
	}
	@Override
	public String definirajNacinIspitivanja() {
		return datumVrijemeIspita;
		// TODO Auto-generated method stub

	}

	@Override
	public void dodijeliOcjene() {
		// TODO Auto-generated method stub

	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(String nastavnik) {
		this.nastavnik = nastavnik;
	}

	public String getDatumVrijemeIspita() {
		return datumVrijemeIspita;
	}

	public void setDatumVrijemeIspita(String datumVrijemeIspita) {
		this.datumVrijemeIspita = datumVrijemeIspita;
	}

	public static int[] getPismeniIspit() {
		return pismeniIspit;
	}

	public static void setPismeniIspit(int[] pismeniIspit) {
		Ispit.pismeniIspit = pismeniIspit;
	}

	public static int[] getUsmeniIspit() {
		return usmeniIspit;
	}

	public static void setUsmeniIspit(int[] usmeniIspit) {
		Ispit.usmeniIspit = usmeniIspit;
	}

}
