package Zadatak1;

import java.util.Scanner;

public class SumaZnamenki {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int uneseniBroj = ulaz.nextInt();
		int zbrojZnamenki=0;
		while(uneseniBroj>0) {
			int znamenka = uneseniBroj%10;
			uneseniBroj /=10;
			zbrojZnamenki+=znamenka;
		}
		System.out.println(zbrojZnamenki);
		ulaz.close();
	}
}
