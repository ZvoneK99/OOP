package Zadatak8;

import java.util.ArrayList;

public class Predmet {
	private String naziv;
	private int ectsBodovi;
	private ArrayList<Student> studenti;
	
	public Predmet(String naziv, int ectsBodovi) {
		this.naziv = naziv;
		this.ectsBodovi = ectsBodovi;
		this.studenti = new ArrayList<>();
	}
	//Getteri i setteri
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getEctsBodovi() {
		return ectsBodovi;
	}
	public void setEctsBodovi(int ectsBodovi) {
		this.ectsBodovi = ectsBodovi;
	}
	
	public ArrayList<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}
	
	public void dodajStudenta(Student s) {
		studenti.add(s);
	}
	public void dohvatiStudenteNaPredmetu(Predmet p) {
		System.out.println("Studenti na predmetu "+p.getNaziv()); 
		for(Student s : p.getStudenti()) {
			System.out.println(s);
		}
	}
	public void prosjecanECTS() {
	    ArrayList<Student> studentiKojiSuPolozili = new ArrayList<>();
	    double zbrojOcjena = 0;
	    
	    System.out.println("Prosjek ECTS studenata koji su položili:");

	    for (Student s : studenti) {
	        if (s.getProsjekOcjena() > 1.5) {
	            studentiKojiSuPolozili.add(s);
	            zbrojOcjena += s.getProsjekOcjena();
	        }
	    }
	    double prosjekOcjena = zbrojOcjena / studentiKojiSuPolozili.size();
	    System.out.println(prosjekOcjena);
	}

}
