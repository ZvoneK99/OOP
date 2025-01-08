package Zadatak1novo;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak1 {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Osoba> fakultet = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int ID = i+1;
			String imePrezime = "Osoba "+ID;
		
			if(random.nextBoolean()) {
				int godinaStudija = random.nextInt(5)+1;
				fakultet.add(new Student(ID, imePrezime, godinaStudija));
			}
			else {
				String predmet = "Predmet "+(random.nextInt(5)+1);
				double ocjenaNastavnika = 3.0+random.nextDouble()*2.0;
				fakultet.add(new Nastavnik( ID, imePrezime, predmet, ocjenaNastavnika));
			}
		}
		System.out.println("Izvanredni studenti");
		for(Osoba osoba : fakultet) {
			if (osoba instanceof Student && osoba.jeLiIZvanredan()) {
                System.out.println(osoba);
            }
		}
		System.out.println("\nIzvanredni nastavnici:");
		for (Osoba osoba : fakultet) {
		    if (osoba instanceof Nastavnik && osoba.jeLiIZvanredan()) {
		        System.out.println(osoba);
		    }
		}
	}
}
