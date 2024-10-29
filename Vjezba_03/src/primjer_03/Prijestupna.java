/* Provjera prijestupne godine
Zadatak: Traži od korisnika unos godine i provjeri je li ta godina prijestupna.*/

package primjer_03;

import java.util.Scanner;
public class Prijestupna {
	
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite godinu da vidite je li prijestupna.");
		int godina = ulaz.nextInt();
		
		if((godina%4==0 && godina%100!=0) || (godina%400==0)) {
			System.out.println("Godina "+godina+ " je prijestupna");
		}
		else {
			System.out.println("Godina "+godina+" nije prijestupna.");
		}
		ulaz.close();

	}
}
