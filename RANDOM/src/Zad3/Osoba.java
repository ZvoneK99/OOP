package Zad3;

public abstract class Osoba {
	String ime;
	String prezime;
	int godine;

	public Osoba(String ime, String prezime, int godine) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	@Override
	public String toString() {
		return "Ime Prezime "+ime+" "+prezime+" Godine "+godine; 
	}
}
