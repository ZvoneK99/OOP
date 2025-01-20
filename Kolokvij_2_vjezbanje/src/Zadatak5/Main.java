package Zadatak5;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Osoba> osobe = new ArrayList<>();
		ArrayList<Radnik> radnici = new ArrayList<>();
		ArrayList<Menadzer> menadzeri = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				int radniSati = random.nextInt(300)+100;
				double satnica = random.nextDouble(122)+6;
				osobe.add(new Radnik(i, " "+i, radniSati, satnica));
			}
			else {
				double osnovnaPlaca = random.nextDouble(3000)+1500;
				double bonus = random.nextDouble(200)+500;
				osobe.add(new Menadzer(i, " "+i, osnovnaPlaca, bonus));
			}
		}
		System.out.println("Osobe s velikom placom");
		for(Osoba osoba : osobe) {
			if(osoba.jeLiVisokaPlaca()) {
				System.out.println(osoba);
			}
		}
		System.out.println("----------------------------");
		for(Osoba radnik : osobe) {
			if(radnik instanceof Radnik) {
				radnici.add((Radnik) radnik);
			}
		}
		double zbrojPlaca = 0;
		double prosjekPlaca =0;
		for(Radnik r : radnici) {
			zbrojPlaca+= r.dohvatiPlacu();
		}
		prosjekPlaca = zbrojPlaca/radnici.size();
		System.out.println("Prosjek placa radnika je: "+prosjekPlaca);
		System.out.println("----------------------------");
		for(Osoba menadzer : osobe) {
			if(menadzer instanceof Menadzer) {
				menadzeri.add((Menadzer) menadzer);
			}
		}
		double zbrojPlacaMenadzera = 0;
		double prosjekPlacaMenadzera = 0;
		for(Menadzer m : menadzeri) {
			zbrojPlacaMenadzera += m.dohvatiPlacu();
		}
		prosjekPlacaMenadzera = zbrojPlacaMenadzera / menadzeri.size();
		System.out.println("Prosjek placa menadzera je "+prosjekPlacaMenadzera);
	}
}
