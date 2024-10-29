/*napisati program koji ce zatraziti unos 2 broja nakon toga ispisati izbornik koji ce simulirati kalkulator
korisnik odabire zeljenu operaciju po odabranoj operaciji ispisuje se rezultat broj operacij broj rezultat*/

package primjer_01;
	
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[]args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		double broj1 = ulaz.nextDouble();
		
		System.out.print("Unesite drugi broj: ");
		double broj2 = ulaz.nextDouble();
	
		System.out.println("-----Odaberite odgovarajuću operaciju-----");
		System.out.println("1.Zbrajanje");
		System.out.println("2.Oduzimanje");
		System.out.println("3.Množenje");
		System.out.println("4.Djeljenje");
		
		System.out.println("Unesite broj operacije");
		int izbor = ulaz.nextInt();
		
		double rezultat = 0;
		String operacija = "";
		boolean ispravanIzbor = true;
		
		if(izbor == 1) {
			rezultat = broj1 + broj2;
			operacija = "zbrajanja";
		}
		else if(izbor == 2) {
			rezultat = broj1 - broj2;
			operacija = "oduzimanja";
		}
		else if(izbor == 3) {
			rezultat = broj1 * broj2;
			operacija = "množenja";
		}
		else if(izbor ==4) {
			if(broj2!=0) {
				rezultat = broj1 / broj2;
				operacija = "djeljenja";
			}
			else {
				System.out.println("Djeljenje s nulom nije dopušteno.");
				ispravanIzbor = false;
			}
		}
		else {
			System.out.println("Unijeli ste pogrešan broj.");
			ispravanIzbor = false;
		}
		if(ispravanIzbor) {
			System.out.println("Rezultat  operacije "+operacija+ " brojeva "+broj1+" i "+broj2+" iznosi "+rezultat+".");	
		}
		ulaz.close();
	}
	
}
