package primjer01;

public class Student extends Osoba {
	String brojIndeksa;
	
	public Student(String ime, int godine, String brojIndeksa) {
		super(ime, godine);
		this.brojIndeksa = brojIndeksa;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Ime: "+ime+", Godine: "+godine+", Broj Indeksa: "+brojIndeksa+".");
	}
}
