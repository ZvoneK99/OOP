package ZAD1;

import java.util.ArrayList;
import java.util.Random;

public class PismeniIspit extends Ispit {
	private String vrstaIspita;
	private String ucionica;
	
	public PismeniIspit(String predmet, String nastavnik, String datumVrijemeIspita, ArrayList<Student> studenti, String ucionica) {
		super(predmet, nastavnik, datumVrijemeIspita, studenti);
		this.setVrstaIspita(getVrsteIspita()[0]);
		this.setUcionica(ucionica);
	}

	public String getVrstaIspita() {
		return vrstaIspita;
	}

	public void setVrstaIspita(String vrstaIspita) {
		this.vrstaIspita = vrstaIspita;
	}

	public String getUcionica() {
		return ucionica;
	}

	public void setUcionica(String ucionica) {
		this.ucionica = ucionica;
	}

	@Override
	public String definirajNacinIspitivanja() {
		return getVrstaIspita();
	}
	@Override
	public int dodjeliOcjene() {
		Random random = new Random();
		return random.nextInt(5)+1;
	}
	@Override
	public String toString() {
		return super.toString()+" Vrsta ispita: ["+getVrstaIspita()+"] Ucionica: "+getUcionica();
	}
}
