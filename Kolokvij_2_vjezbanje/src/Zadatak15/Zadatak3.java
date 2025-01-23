package Zadatak15;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak3 {
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				zaposlenici.add(new Programer(i, " "+i, i+300, i+500, i+32));
			}
			else {
				zaposlenici.add(new Voditelj(i, " "+i+1, random.nextDouble(500)+1000, i+5, i*14));
			}
		}
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z+" Ukupna placa "+z.izracunajPlacu());
			
		}
		System.out.println("----------------------------");
		Zaposlenik najvecaPlaca = zaposlenici.get(0);
		for(Zaposlenik z : zaposlenici) {
			if(z.izracunajPlacu() > najvecaPlaca.izracunajPlacu()) {
				najvecaPlaca = z;
			}
		}
		System.out.println(najvecaPlaca+" "+najvecaPlaca.izracunajPlacu());
	}
}
