package ZAD1;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Ispit implements Ocjenjivanje {
	private String predmet;
	private String nastavnik;
	private String datumVrijemeIspita;
	ArrayList<Student> studenti;
	private static String[] vrsteIspita = {"pismeniIspit", "usmeniIspit"};
	
	
	public Ispit(String predmet, String nastavnik, String datumVrijemeIspita, ArrayList<Student> studenti) {
		this.predmet = predmet;
		this.nastavnik = nastavnik;
		this.datumVrijemeIspita = datumVrijemeIspita;
		this.studenti = studenti;
	}
	@Override
	public String definirajNacinIspitivanja() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int dodjeliOcjene() {
		// TODO Auto-generated method stub
		return 0;
	}
	//getteri i setteri
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
	
	public static String[] getVrsteIspita() {
		return vrsteIspita;
	}
	public static void setVrsteIspita(String[] vrsteIspita) {
		Ispit.vrsteIspita = vrsteIspita;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Predmet: ").append(predmet)
	      .append(", Nastavnik: ").append(nastavnik)
	      .append(", Datum i vrijeme ispita: ").append(datumVrijemeIspita)
	      .append(", Vrsta ispita: ").append(Arrays.toString(vrsteIspita));
	    sb.append("\nStudenti:\n");
	    for (Student student : studenti) {
	        sb.append(student).append("\n");
	    }
	    return sb.toString();
	}
}
