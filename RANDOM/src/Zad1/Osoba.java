package Zad1;

import java.util.ArrayList;
import java.util.Random;

public class Osoba {
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
		return ime+" "+prezime+" "+godine;
	}

public static void main(String[]args) {
	Random random = new Random();
	ArrayList<Osoba> osobe = new ArrayList<>();
	
	for(int i=0; i<10; i++) {
		String ime = "Ime "+random.nextInt(100);
		String prezime = "Prezime" +random.nextInt(15);
		int godine = random.nextInt(63)+18;
		
		osobe.add(new Osoba(ime, prezime, godine));
		}
	for(Osoba o : osobe) {
		System.out.println(o);
	}
	}
}