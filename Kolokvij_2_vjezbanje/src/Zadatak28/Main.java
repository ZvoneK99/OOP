package Zadatak28;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		Radnik r1 = new Radnik(1, "Zvone Kozul", 15);
		Radnik r2 = new Radnik(2, "Ante Bubalo", 4);
		Radnik r3 = new Radnik(3, "Pero Bubalo", 6);
		Radnik r4 = new Radnik(4, "Ilija Bubalo",7);
		Radnik r5 = new Radnik(5, "Stipe Bubalo", 40);
		
		Tim t1 = new Tim("Najbolji ljudi", r1);
		Tim t2 = new Tim("Seronje", r3);
		
		ArrayList<Tim> timovi = new ArrayList<>();
		timovi.add(t1);
		timovi.add(t2);
		
		t1.dodajClana(r5);
		t2.dodajClana(r2);
		t2.dodajClana(r4);
		
			System.out.println(t1.toString());
			System.out.println("-----------------------");
			System.out.println(t2.toString());
			
			Tim najvecaPlaca = timovi.get(0);
			for(Tim t : timovi) {
				if(t.izracunajUkupnuPlacu() > najvecaPlaca.izracunajUkupnuPlacu()) {
					najvecaPlaca = t;
				}
				
			}
			System.out.println("Tim sa najvecom placom je");
			System.out.println(najvecaPlaca);
	}
	
	
}
