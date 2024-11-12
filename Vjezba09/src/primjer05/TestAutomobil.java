package primjer05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class TestAutomobil {
	public static void main(String[]args) {
		ArrayList<Automobil> automobili = new ArrayList<>();
		ArrayList<Osoba> osobe = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		//Unos podataka o autu i vlasniku
		for(int i=0; i<5; i++) {
		System.out.println("Unesite marku automobila: "+(i+1)+".");
		String markaAuta = ulaz.nextLine();
		
		System.out.println("Unesite model automobila: "+(i+1)+".");
		String modelAuta = ulaz.nextLine();
		
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("Unesite godinu proizvodnje automobila: ");
		int godinaProizv = ulaz.nextInt();
		ulaz.nextLine();
		
		while(godinaProizv>trenutnaGodina) {
			System.out.println("Godina ne moze biti u budućnosti. Pokušajte ponovno.");
			System.out.println("Unesite godinu proizvodnje automobila: ");
			godinaProizv = ulaz.nextInt();
			ulaz.nextLine();
			}
		Automobil auto = new Automobil(markaAuta, modelAuta, godinaProizv);
		automobili.add(auto);
		}
		ulaz.close();
		System.out.println("Popis automobila:");
		for(Automobil a : automobili) {
			System.out.println(a.toString());
		}
	}
}
