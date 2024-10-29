/*Kreirati program koji će od korisnika traziti unos stranica pravokutnika nakon unosa stranica 
 * ispisati opseg i povrsinu pravokutnika te ispisati radi li se o kvadratu*/


package primjer_02;

import java.util.Scanner;
public class Pravokutnik {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite prvu stranicu: ");
		double stranicaA = ulaz.nextDouble();
		
		System.out.print("Unesite drugu stranicu: ");
		double stranicaB = ulaz.nextDouble();
		
		double opseg = 2*(stranicaA + stranicaB);
		double povrsina = stranicaA * stranicaB;
		
		System.out.println("Opseg pravokutnika iznosi: "+opseg);
		System.out.println("Površina pravokutnika iznosi: "+povrsina);
		
		if(stranicaA == stranicaB) {
			System.out.println("Radi se o kvadratu.");
		}
		else {
			System.out.println("Ne radi se o kvadratu.");
		}
		ulaz.close();
	}
}
