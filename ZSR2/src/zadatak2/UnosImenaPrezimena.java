package zadatak2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UnosImenaPrezimena {
	public static void main(String[]args) {
		List<Osoba> osobe = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			 System.out.println("Unos podataka za osobu " + (i + 1) + ":");
	            Osoba osoba = Osoba.unosPodataka();
	            osobe.add(osoba);
		}
		 System.out.println("\nPopis unesenih osoba:");
	        for (Osoba osoba : osobe) {
	            System.out.println(osoba);
        }
	        osobe.sort(Comparator.comparing(Osoba::getIme).thenComparing(Osoba::getPrezime));
	        
	        System.out.println("Popis osoba sortiran abecedno:");
	        for(Osoba osoba : osobe) {
	        	System.out.println(osoba);
	        }
	}
}
