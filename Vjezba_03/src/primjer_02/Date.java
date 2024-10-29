/*Traži od korisnika unos datuma u formatu dan.mjesec.godina (npr. 10.5.2023) i razdvoji dan, mjesec i godinu. 
 Zatim ispiši svaku vrijednost zasebno.*/

package primjer_02;

import java.util.Scanner;
public class Date {
	
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite datum(dan.mjesec.godina).");
		String datum = ulaz.nextLine();
		
		String[] djelovi = datum.split("\\.");
		if(djelovi.length != 3) {
			System.out.println("Nije dobar format datuma.");
			ulaz.close();
			return;
		}
		
		int dan = Integer.parseInt(djelovi[0]);
		int mjesec = Integer.parseInt(djelovi[1]);
		int godina = Integer.parseInt(djelovi[2]);
	
		System.out.println("Dan: "+dan);
		System.out.println("Mjesec: "+mjesec);
		System.out.println("Godina: "+godina);
	}
	
}
