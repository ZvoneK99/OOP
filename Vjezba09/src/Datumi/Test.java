package Datumi;

import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		
		Scanner ulaz = new Scanner(System.in);
		int dan; 
		do {
			System.out.println("Unesite dan: ");
			dan = ulaz.nextInt();
			if(dan<1 || dan>31) {
				System.out.println("Nevažeći dan.");
			}
		}while(dan<1 || dan>31);
		
		int mjesec;
		do {
			System.out.println("Unesite mjesec: ");
			mjesec = ulaz.nextInt();
			if(mjesec<1 || mjesec>12) {
				System.out.println("Nevažeći mjesec.");
			}
		}while(dan<1 || dan>12);
		
		System.out.println("Unesite godinu: ");
		int godina = ulaz.nextInt();
		Datum datum = new Datum(dan, mjesec, godina);
		System.out.println("Datum koji ste unijeli: "+datum.ispisiDatumTekstualno());
		ulaz.close();

	}
}
