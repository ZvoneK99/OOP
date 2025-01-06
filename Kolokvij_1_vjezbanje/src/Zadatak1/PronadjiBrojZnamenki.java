package Zadatak1;

import java.util.Scanner;

public class PronadjiBrojZnamenki {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		int brojacZnamenki=0;
		broj= Math.abs(broj);
		
		while(broj>0) {
			int znamenka = broj%10;
			broj/=10;
			brojacZnamenki++;
		}
		System.out.println("Broj ima "+brojacZnamenki+" znamenki.");
		ulaz.close();
	}
}
