package zadatak02;

public class Student implements Comparable<Student>{
	String ime;
	String prezime;
	String brojIndeksa;
	double prosjekOcjena;
	
	public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.prosjekOcjena = prosjekOcjena;
	}
	public void ispisiImePrezime() {
		System.out.println(ime+" "+prezime);
	}
	
	@Override
	public int compareTo(Student drugiStudent) {
		if(this.prosjekOcjena>drugiStudent.prosjekOcjena) {
			return 1;
		}
		else if(this.prosjekOcjena==drugiStudent.prosjekOcjena ) {
			return 0;
		}
		else {
			return -1;
		}
	}
	public String toString() {
		return ime+" "+prezime+" "+prosjekOcjena;
	}
}
