package ZSR2ZAD3;

public class Student {
	String ime;
	String prezime; 
	String studij;
	int godinaStudija;
	String brojIndeksa;
	
	public Student(String ime, String prezime, String studij, int godinaStudija, String brojIndeksa) {
		this.ime = ime;
		this.prezime = prezime;
		this.studij = studij;
		this.godinaStudija = godinaStudija;
		this.brojIndeksa = brojIndeksa;
	}
	
	public int getGodinaStudija() {
		return this.godinaStudija;
	}
	public String toString() {
		return "Ime i prezime <"+ime+" "+prezime+"> Studij<"+studij+">, Godina studija <"+godinaStudija+"> Broj indeksa <"+brojIndeksa+">";
	}
}
