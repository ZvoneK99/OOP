package Zadatak9;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Zivotinja> zivotinje = new ArrayList<>();
		ArrayList<Zivotinja> macke = new ArrayList<>();
		ArrayList<Zivotinja> psi = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				int ID = random.nextInt(4);
				String vrsta = "Vrsta: "+random.nextInt(15)+10;
				int brojMiseva = random.nextInt(10)+10;
				double tezina = random.nextDouble(50)+25;
				zivotinje.add(new Macka(ID, vrsta, brojMiseva, tezina));
			}
			else {
				int ID = random.nextInt(15)+10;
				String vrsta = "Vrsta "+random.nextInt(45)+3;
				int brojZadataka = random.nextInt(41);
				double tezina = random.nextDouble(12)+40;
				zivotinje.add(new Pas(ID, vrsta, brojZadataka, tezina));
			}
		}
		System.out.println("Zivotinje koje prekoracuju tezinu:");
		for(Zivotinja z : zivotinje) {
			if(z.jeLiTezinaPrekoracena()) {
				System.out.println(z);
			}
		}
		System.out.println("Mačke:");
		double prosjekTezineMacaka = 0;
		double zbrojTezineMacaka=0;
		for(Zivotinja z : zivotinje) {
			if(z instanceof Macka) {
				macke.add(z);
				zbrojTezineMacaka += z.dohvatiTezinu();
				System.out.println(z);
			}
		}
		prosjekTezineMacaka = zbrojTezineMacaka / macke.size();
		System.out.println("Prosjecna tezina mačke: "+prosjekTezineMacaka);
		
		System.out.println("Psi:");
		double prosjekTezinePasa = 0;
		double zbrojTezinePasa = 0;
		for(Zivotinja z : zivotinje) {
			if(z instanceof Pas) {
				psi.add(z);
				zbrojTezinePasa += z.dohvatiTezinu();
				System.out.println(z);
			}
		}
		prosjekTezinePasa = zbrojTezinePasa / psi.size();
		System.out.println("Prosjecna tezine psa: "+prosjekTezinePasa);
	}
}
