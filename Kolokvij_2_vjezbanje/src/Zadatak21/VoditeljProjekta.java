package Zadatak21;

public class VoditeljProjekta extends Zaposlenik implements RadniUcinak{
	private int brojProjekata;
	private int uspjesnostProjekta;
	
	public VoditeljProjekta(int ID, String imePrezime, int godineIskustva, int brojProjekata, int uspjesnostProjekta) {
		super(ID, imePrezime, godineIskustva);
		this.setBrojProjekata(brojProjekata);
		if(uspjesnostProjekta < 1 || uspjesnostProjekta > 10) {
			throw new IllegalArgumentException("Uspjesnost projekta je broj od 1 do 10");
		}
		this.setUspjesnostProjekta(uspjesnostProjekta);
	}

	public int getBrojProjekata() {
		return brojProjekata;
	}

	public void setBrojProjekata(int brojProjekata) {
		this.brojProjekata = brojProjekata;
	}

	public int getUspjesnostProjekta() {
		return uspjesnostProjekta;
	}

	public void setUspjesnostProjekta(int uspjesnostProjekta) {
		this.uspjesnostProjekta = uspjesnostProjekta;
	}
	@Override
	public double izracunajBodove() {
		return brojProjekata * (uspjesnostProjekta / 100);
	}
	@Override
	public void prikaziUcinak() {
		System.out.println("Broj projekata "+getBrojProjekata()+" Uspjesnost projekata "+getUspjesnostProjekta());
	}
	@Override
	public String toString() {
		return super.toString()+" Broj projekata "+getBrojProjekata()+" Uspjesnost projekta "+getUspjesnostProjekta();
	}
}
