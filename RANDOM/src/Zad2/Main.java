package Zad2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Vozilo> vozila = new ArrayList<>();
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				vozila.add(new OsobnoVozilo(random.nextInt(4)+2));
			}
			else {
				vozila.add(new TeretnoVozilo(random.nextInt(5)*10));
			}
		}
		System.out.println("Putnicka vozila");
		for(Vozilo vozilo : vozila) {
			if(vozilo.dohvatiTipVozila().equals("Osobno vozilo")) {
				System.out.println(vozilo);
			}
		}
		System.out.println("Teretna vozila");
		for(Vozilo vozilo : vozila) {
			if(vozilo.dohvatiTipVozila().equals("Teretno vozilo")) {
				System.out.println(vozilo);
			}
		}
		
	}
}
