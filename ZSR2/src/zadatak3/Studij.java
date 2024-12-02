package zadatak3;

public class Studij {
	String naziv;
	public Studij(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return "Naziv studija: "+naziv;
	}
}
