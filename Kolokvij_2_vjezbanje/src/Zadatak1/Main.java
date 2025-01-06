package Zadatak1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main (String[]args) {
		Random random = new Random();
		ArrayList<Osoba> fakultet = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int id = random.nextInt(100);
			String imePrezime = "Osoba "+(i+1);
			
			if(random.nextBoolean()) {
				int godinaStudija = random.nextInt(5)+1;
				fakultet.add(new Student(id, imePrezime, godinaStudija));
			}
			else {
				String predmet = "Predmet "+(i+1);
				fakultet.add(new Nastavnik(id, imePrezime, predmet));
			}
		}
		System.out.println("Osobe s parnim ID");
		for(Osoba o : fakultet) {
				System.out.println(o);
		}
	}
}
