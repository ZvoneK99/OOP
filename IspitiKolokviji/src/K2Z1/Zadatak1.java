package K2Z1;

import java.util.Random;

public class Zadatak1 {
	public static void main(String[]args) {
		Osoba[] fakultet = new Osoba[10];
		Random random = new Random();
		
		for(int i=0; i<fakultet.length; i++) {
			int tip = random.nextInt(2);
			
		if(tip==0) {
			fakultet[i] = new Student(i+1, "Student"+(i+1), random.nextInt(5)+1);
		}else {
			fakultet[i] = new Nastavnik(i+1, "Nastavnik"+(i+1), "Predmet "+(i+1), random.nextDouble()*5);
		}
		}
		for(Osoba osoba : fakultet ) {
			System.out.println(osoba);
		}
	}
}
