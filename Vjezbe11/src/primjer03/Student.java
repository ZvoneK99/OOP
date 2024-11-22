package primjer03;

public class Student {
	String ime; 
	String prezime;
	double prosjekOcjena;
	
	public Student(String ime, String prezime, double prosjekOcjena) {
		this.ime = ime;
		this.prezime = prezime;
		this.prosjekOcjena = prosjekOcjena; 
	}
	
	public double getProsjekOcjena() {
		return this.prosjekOcjena;
	}
	
	public boolean većiOdProsjeka(double prosjek) {
		return this.prosjekOcjena>prosjek;
	}
	
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime+", Prosjek ocjena: "+prosjekOcjena+".");
	}
}
