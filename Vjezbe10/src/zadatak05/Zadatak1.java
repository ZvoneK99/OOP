//rastavljanje broja i određivanje najvece i najmanje znamenke;

package zadatak05;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite neki broj:");
		int broj = ulaz.nextInt();
		int najveci =0;
		int najmanji = 9;
		while(broj>0) {
			int znamenka = broj%10;
			if(znamenka>najveci) {
				najveci = znamenka;
			}
			if(znamenka<najmanji) {
				najmanji = znamenka;
			}
			broj/=10;
		}
		System.out.println("Najveca znamenka je: "+najveci);
		System.out.println("Najmanja znamenka je: "+najmanji);
	}
}
