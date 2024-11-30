package zadatak8;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj.");
		int uneseniBroj = ulaz.nextInt();
		
		int najvecaZnamenka=0;
		int najmanjaZnamenka=9;
		
		while(uneseniBroj>0) {
			int znamenka = uneseniBroj%10;
			
			if(znamenka>najvecaZnamenka) {
				najvecaZnamenka = znamenka;
			}
			if(znamenka<najmanjaZnamenka) {
				najmanjaZnamenka = znamenka;
			}
			uneseniBroj /= 10;
		}
		System.out.println(najvecaZnamenka);
		System.out.println(najmanjaZnamenka);
		ulaz.close();
	}
}
