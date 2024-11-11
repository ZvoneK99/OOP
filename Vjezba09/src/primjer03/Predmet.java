package primjer03;

public class Predmet {
	String nazivPredmeta;
	Studij studij;
	int godinaStudija;
	public Predmet(String nazivPredmeta, Studij studij, int godinaStudija) {
		this.nazivPredmeta = nazivPredmeta;
		this.studij = studij;
			this.godinaStudija = godinaStudija;
	}
	
	@Override
	public String toString() {
	    return nazivPredmeta + " (" + godinaStudija + ". godina, Studij: " + studij.getNaziv() + ")";
	}

}
