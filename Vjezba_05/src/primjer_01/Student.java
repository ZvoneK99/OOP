package primjer_01;

public class Student extends Osoba {
	int brojIndeksa;
	double prosjekOcjena;
	
	public Student(String ime, String prezime, int godinaRođenja, int brojIndeksa, double prosjekOcjena) {
		super(ime, prezime, godinaRođenja);
		this.brojIndeksa = brojIndeksa;
		this.prosjekOcjena = prosjekOcjena;
	}
	public boolean prosjecneOcjene() {
		int prosjecnaOcjena = 3;
		if(prosjekOcjena>=prosjecnaOcjena) {
			return true;
		}else {
			return false;
		}
	}

	public void ispisiDetalje() {
		String stanjeOcjene = prosjecneOcjene() ? "veću ocjenu" : "manju ocjenu";
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Godina rođenja: "+godinaRođenja);
		System.out.println("Broj indeksa: "+brojIndeksa);
		System.out.println("Prosjecna ocjena: "+prosjekOcjena);
		System.out.println("Student ima "+stanjeOcjene+" od prosjecne ocjene.");
	}
}
