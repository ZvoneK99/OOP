package primjer02;

import java.util.ArrayList;

public class Student {
	String ime;
	String prezime;
	String brojIndeksa;
	int godinaStudija;
	ArrayList<Kolegij> kolegiji;
	
	public Student(String ime, String prezime, String brojIndeksa, int godinaStudija) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
		this.kolegiji = new ArrayList<>();
	}
	public void dodajKolegij(Kolegij kolegij) {
		kolegiji.add(kolegij);
		System.out.println("Kolegij "+kolegij+" je dodan.");
		System.out.println("-----------------------------");
	}
	public void ispisiSveKolegije() {
		System.out.println("Kolegiji koje student pohađa su: ");
		for(Kolegij k : kolegiji) {
			k.ispisiImeKolegija();
		}
	}

	public void ispisiDetalje() {
		System.out.println("Podatci o studentu:");
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Broj indeksa: "+brojIndeksa);
		System.out.println("GodinaStudija: "+godinaStudija);
		System.out.println("-----------------------------");
	}
	
	public static void main(String[]args) {
		Student s1 = new Student("Zvone", "Kozul", "1743/rr", 3);
		Kolegij k1 = new Kolegij("Matematika", 7);
		Kolegij k2 = new Kolegij("OOP", 5);
		Kolegij k3 = new Kolegij("Fizika", 3);
		s1.ispisiDetalje();
		s1.dodajKolegij(k1);
		s1.dodajKolegij(k2);
		s1.dodajKolegij(k3);
		s1.ispisiSveKolegije();
	}
}
