package Zadatak1;

import java.util.Scanner;

public class PrvaZadnjaZnamenka {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj=ulaz.nextInt();
		
		int zadnjaZnamenka = broj % 10;
		
		int prvaZnamenka = broj;
		while(prvaZnamenka>=10) {
			prvaZnamenka /= 10;
		}
			System.out.println("Prva "+prvaZnamenka);
			System.out.println("Zadnja "+zadnjaZnamenka);
			ulaz.close();
	}
}
