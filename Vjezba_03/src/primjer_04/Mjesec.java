/*Zadatak: Ispis mjeseca riječima
Zadatak: Korisnik unosi broj između 1 i 12, a program ispisuje naziv mjeseca. Ako korisnik unese broj izvan tog raspona, ispiši poruku o grešci.*/

package primjer_04;

import java.util.Scanner;
public class Mjesec {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj mjeseca da saznate njegovo ime.");
		int mjesec = ulaz.nextInt();
		
		if(mjesec<1 || mjesec>12) {
			System.out.println("Unijeli ste nevaljali mjesec. Unesite broj 1-12.");
			ulaz.close();
			return;
		}
		String[] mjeseci = {"Siječanj", "Veljača", "Ožujak", "Travanj", "Svibanj", "Lipanj", "Srpanj",
				"Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};
		System.out.println(mjeseci[mjesec-1]); 
		ulaz.close();

	}
}
