package Zadatak1;

import java.util.Scanner;

public class ParniNeparni {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		
		int brojParnih=0;
		int brojNeparnih=0;
		int sumaParnih=0;
		int sumaNeparnih=0;
		
		while(broj>0) {
			int znamenka = broj%10;
			broj/=10;
			
			if(znamenka%2==0) {
				brojParnih++;
				sumaParnih+=znamenka;
			}
			else {
				brojNeparnih++;
				sumaNeparnih+=znamenka;
			}
		}
		System.out.println("Parne znamenke "+brojParnih+" Suma parnih "+sumaParnih);
		System.out.println("Neparne znamenke "+brojNeparnih+" Suma neparnih "+sumaNeparnih);
		ulaz.close();
	}
	
}
