package primjer06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Unesite ime osobe "+(i+1));
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime osobe: "+(i+1));
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite godinu rođenja"); 
			int godina = ulaz.nextInt();	
			int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
				if(godina>trenutnaGodina) {
					System.out.println("Unijeli ste pogresnu godinu.");
					i--;
					ulaz.nextLine();
					continue;
				}
				
				System.out.println("Unesite mjesec rođenja: ");
				int mjesec = ulaz.nextInt();
				if(mjesec<1 || mjesec>12) {
					System.out.println("Taj mjesec ne postoji.");
					i--;
					ulaz.nextLine();
					continue;
				}
				
				System.out.println("Unesite dan rođenja:");
				int dan = ulaz.nextInt();
				if(dan<1 || dan>31) {
					System.out.println("Taj dan mjeseca ne postoji.");
					i--;
					ulaz.nextLine();
					continue;
				}
				Datum datum = new Datum(dan, mjesec, godina);
				Osoba osoba = new Osoba(ime, prezime, datum);
				osobe.add(osoba);
				ulaz.nextLine();

				osobe.sort(Comparator.comparing(Osoba::getDatumRođenja));
				 System.out.println("Osobe sortirane od najstarije do najmlađe su:");
				 for(Osoba o : osobe) {
					 o.toString();
				 }
		}
	}
}
