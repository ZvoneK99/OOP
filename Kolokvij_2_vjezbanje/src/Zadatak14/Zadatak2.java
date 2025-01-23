package Zadatak14;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<Osoba>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				osobe.add(new Student(i, " "+(i+1), random.nextInt(5)+1));
			}
			else {
				osobe.add(new Nastavnik(i+1, " "+(i-1), " "+(i), random.nextInt(5), random.nextInt(5)+1));
			}
		}
		System.out.println("Studenti");
		for(Osoba o : osobe) {
			if(o instanceof Student) {
				System.out.println(o.ispisiIzvjestaj());
			}
		}
		System.out.println("Nastavnici");
		for(Osoba o : osobe) {
			if(o instanceof Nastavnik) {
				System.out.println(o.ispisiIzvjestaj());
			}
		}
	}
}
