package Zadatak2;

import java.util.Scanner;

public class FaktorijelBroja {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		
		int rezultat = 1 ;
		for(int i=1; i<=broj; i++) {
			rezultat*=i;
		}
		System.out.println(rezultat);
	}
}
