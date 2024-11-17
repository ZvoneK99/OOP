//Provjera je li broj palindrom

package zadatak4;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj da provjerimo je li palindrom.");
		int broj = ulaz.nextInt();
		int originalniBroj = broj;
		int brojNaopako = 0;
		while(broj!=0) {
			int znamenka = broj%10;
			brojNaopako = brojNaopako*10+znamenka;
			broj/=10;
		}
		if(originalniBroj==brojNaopako) {
			System.out.println("Broj je palindrom.");
		}
		else {
			System.out.println("Broj nije palindrom.");
		}
		ulaz.close();
	}
}
