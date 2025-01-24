package Zadatak17;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak5 {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			if(random.nextBoolean()) {
				osobe.add(new Natjecatelj(i, " "+i, i+5));
			}
			else {
				osobe.add(new Organizator(i, " IP "+i, i+5, i+4));
			}
		}
		for(Osoba osoba : osobe) {
			osoba.prikaziDetalje();
		}
		Osoba najboljiRezultat = osobe.get(0);
		for(Osoba o : osobe) {
			if(o.izracunajRezultat() > najboljiRezultat.izracunajRezultat()) {
				najboljiRezultat = o;
			}
		}
		System.out.println("Osoba s najboljim rezultatom");
		najboljiRezultat.prikaziDetalje();
	}
}
