package ZAD1;

public class Student {
	private int brojIndeksa;
	private String imePrezime;
	private int ocjena;
	
	public Student(int brojIndeksa, String imePrezime, int ocjena) {
		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
		this.ocjena = ocjena;
	}
	 @Override
	    public String toString() {
	        return "Broj indeksa: " + brojIndeksa + ", Ime i prezime: " + imePrezime + ", Ocjena: " + ocjena;
	    }
}
