package primjer03;

public class Studij {
	private String naziv;

	public Studij(String naziv) {
		this.naziv = naziv;
	}
	//Getter i setter za naziv
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String toString() {
		return naziv;
	}
	
}

