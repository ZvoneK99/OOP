package Zad3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			String ime = "Ime" +random.nextInt(100);
			String prezime = "Prezime" +random.nextInt(45)+14;
			int godine = random.nextInt(30)+20;
			
			if(random.nextBoolean()) {
				double bonus = random.nextInt()*1000;
				zaposlenici.add(new Menadzer(ime, prezime, godine, bonus));
			}
			else {
				double satnica = random.nextInt()* 50+10;
				int brojSati = random.nextInt(40) + 20;
				zaposlenici.add(new Radnik(ime, prezime, godine, satnica, brojSati));
			}
		}
		System.out.println("Menadzeri su ");
		for(Zaposlenik z : zaposlenici) {
			if(z.dohvatiPoziciju().equals("Menadzer")) {
				System.out.println(z);
			}
		}
		System.out.println("Radnici su");
		for(Zaposlenik z : zaposlenici) {
			if(z.dohvatiPoziciju().equals("Radnik")) {
				System.out.println(z);
			}
		}
	}
	
}
