package zadatak4;

public class Student {
	String ime;
	String prezime;
	int ocjena;
	
	public Student(String ime, String prezime, int ocjena) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocjena = ocjena;
	}
	public int getOcjena() {
		return this.ocjena;
	}
	@Override
	public String toString() {
		return "Ime i prezime "+ime+" "+prezime+", Ocjena: "+ocjena+".";
	}
}
