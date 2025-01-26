package Zadatak21;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<Zaposlenik>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				zaposlenici.add(new Programer(i, ""+i, random.nextInt(10)+1, random.nextInt(5000)+2500));
			}
			else {
				zaposlenici.add(new VoditeljProjekta(i, ""+i, random.nextInt(10)+1, random.nextInt(20)+20, random.nextInt(10)+1));
			}
		}
		Zaposlenik najviseBodova = zaposlenici.get(0);
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z.toString());
			if(z.izracunajBodove() > najviseBodova.izracunajBodove()) {
				najviseBodova = z;
			}
		}
		System.out.println("-------------------");
		System.out.println("Zaposlenik sa najvise bodova je :");
		System.out.println(najviseBodova);
		System.out.println("Seniori");
		for(Zaposlenik z : zaposlenici) {
			if(z.jeLiSenior()) {
				System.out.println(z);
			}
		}
	}
}
