package Zadatak1novo2;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak1 {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Osoba> fakultet = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int ID = i+1;
			String imePrezime = "Osoba "+i+1; 
			
			if(random.nextBoolean()) {
				int godinaStudija = random.nextInt(5)+1;
				fakultet.add(new Student(ID, imePrezime, godinaStudija));
			}
			else {
				String predmet ="Predmet "+random.nextInt(5)+1;
				double ocjena = random.nextDouble(5)+1;
				fakultet.add(new Nastavnik(ID, imePrezime, predmet, ocjena));
			}
		}
		System.out.println("Izvanredni studenti: ");
			for(Osoba osoba : fakultet) {
				if(osoba instanceof Student && osoba.jeLiIzvanredan()) {
					System.out.println(osoba);
				}
			}
			System.out.println("Izvanredni nastavnici");
			for(Osoba osoba : fakultet) {
				if(osoba instanceof Nastavnik && osoba.jeLiIzvanredan()) {
					System.out.println(osoba);
				}
			}
	}
}
