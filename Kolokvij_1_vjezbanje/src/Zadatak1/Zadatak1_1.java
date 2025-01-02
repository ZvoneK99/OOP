package Zadatak1;

import java.util.Scanner;

public class Zadatak1_1 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijeli broj."); {
			int broj = ulaz.nextInt();
			
			int zbrojParnih=0;
			int zbrojNeparnih=0;
			
			while(broj>0) {
				int znamenka = broj % 10;
				broj /= 10;
				
				if(znamenka % 2 == 0 ) {
					zbrojParnih+=znamenka;
				}
				if(znamenka % 2 != 0) {
					zbrojNeparnih+=znamenka;
				}
			}
			System.out.println("Zbroj parnih = "+zbrojParnih);
			System.out.println("Zbroj neparnih = "+zbrojNeparnih);
		}
		ulaz.close();
	}
}
