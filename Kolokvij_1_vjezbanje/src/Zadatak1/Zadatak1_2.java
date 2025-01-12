package Zadatak1;

import java.util.Scanner;

public class Zadatak1_2 {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj. ");
		int broj = ulaz.nextInt();
		
		int zbrojParnih=0;
		int zbrojNeparnih=0;
		int pozicija = 1;
		while(broj>0) {
			int znamenka = broj%10;
			
			if(pozicija%2==0) {
				zbrojParnih+=znamenka;
			}
			else {
				zbrojNeparnih+=znamenka;
			}
			pozicija++;
			broj /=10;
		}
		if(zbrojParnih==zbrojNeparnih) {
			System.out.println("Sretni broj");
		}
		else {
			System.out.println("Nesretni broj");
		}
		ulaz.close();
	}
}
