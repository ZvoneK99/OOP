/*Kreirati program koji će od korisnika traziti unos stranica pravokutnika
 nakon unosa stranica ispisati opseg i povrsinu pravokutnika
 te ispisati radi li se o kvadratu
 
 2.dio kreirati klasu pravokutnik koja ce imati (dvije stranice, konstruktor u koji proslijeđujemo stranice, konstruktor kopije
 	ta klasa ce imati 2 metode postaviA postaviB;
 	medote: ispisStranicuA ispisiStranicuB 
 	imati ce metode za racunanje opsega i povrsine, koje nece ispisivati nego vracati te vrijednosto
 	u glavnom programu instancirati objekt pravokutnik i ispisati vrijednosti
 */


package primjer_02;

	import java.util.Scanner;
public class primjer_02 {
	public static void main(String[]args) {
	Scanner ulaz = new Scanner(System.in);
	System.out.println("Unesite velicinu prve stranice");
	int stranica1 = ulaz.nextInt();
	
	System.out.println("Unesite veličinu druge stranice:");
	int stranica2 = ulaz.nextInt();
	
	int opseg = 2* (stranica1 +stranica2);
	int povrsina = stranica1*stranica2;
		
	System.out.println("Opseg pravokutnika je: "+opseg);
 System.out.println("Površina pravokutnika je: " + povrsina);
 
 	if(stranica1 == stranica2) {
 		System.out.println("Radi se o kvadratu");
 	}
 	else {
 		System.out.println("Ne radi se o kvadratu");
 		ulaz.close();
 	}
	}
	class Pravokutnik {
		
	}
}
