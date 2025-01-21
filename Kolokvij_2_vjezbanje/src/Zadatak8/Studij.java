package Zadatak8;

import java.util.ArrayList;

public class Studij {
	private String nazivStudija;
	private ArrayList<Predmet> predmeti;
	
	public Studij(String nazivStudija) {
		this.setNazivStudija(nazivStudija);
		this.setPredmeti(new ArrayList<Predmet>());
	}

	public String getNazivStudija() {
		return nazivStudija;
	}
	public void setNazivStudija(String nazivStudija) {
		this.nazivStudija = nazivStudija;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	public void dodajPredmetNaStudij(Predmet p) {
		predmeti.add(p);
	}
	public void ispisPredmetaStudenata(Studij s) {
		System.out.println("Ispis predmeta na studiju "+s.getNazivStudija());
		for(Predmet p : s.getPredmeti()) {
			System.out.println(p.getNaziv());
		}
		System.out.println("Ispis studenata na studiju "+s.getNazivStudija());
		for(Predmet p : s.getPredmeti()) {
			System.out.println("Predmet: "+p.getNaziv());
			for(Student student : p.getStudenti()) {
				System.out.println(student);
			}
		}
	}
	public void ukupnoECTSStudij(Studij s) {
	    int ukupnoECTS = 0;

	    System.out.println("Računanje ukupnog broja ECTS bodova za studij: " + s.getNazivStudija());

	    // Iteracija kroz predmete na studiju
	    for (Predmet p : s.getPredmeti()) {
	        // Iteracija kroz studente na predmetu
	        for (Student student : p.getStudenti()) {
	            ukupnoECTS += p.getEctsBodovi();
	        }
	    }

	    System.out.println("Ukupni broj ECTS bodova za studij '" + s.getNazivStudija() + "': " + ukupnoECTS);
	}

}