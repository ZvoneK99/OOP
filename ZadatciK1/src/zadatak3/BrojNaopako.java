//Ispisi broj naopako

package zadatak3;

import java.util.Scanner;

public class BrojNaopako {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		int brojNaopako=0;
		while(broj!=0) {
			int znamenka = broj%10;
			brojNaopako = brojNaopako*10+znamenka;
			broj=broj/10;
		}
		System.out.println(brojNaopako);
		ulaz.close();
	}
}
