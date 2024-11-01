/* Dodavanje i ispis elemenata
Napravi ArrayList koji prima cijele brojeve (Integer).
 Unosi brojeve sve dok korisnik ne unese negativan broj. Na kraju, ispiši sve unesene brojeve.*/

package primjer_01;

import java.util.ArrayList;
import java.util.Scanner;
public class Klasa {

		public static void main(String[]args) {
			ArrayList<Integer> brojevi = new ArrayList<Integer>();
			Scanner ulaz = new Scanner(System.in);
			System.out.println("Unesite neki broj.");
			int broj = ulaz.nextInt();
			brojevi.add(broj);
			while(broj>0) {
				System.out.println("Unesite neki broj.");
				broj = ulaz.nextInt();
				if(broj>=0) {
					brojevi.add(broj);

				}
			}
			System.out.println("Brojevi koje ste unili su: "+brojevi);
		ulaz.close();
		}
}
