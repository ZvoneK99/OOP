package Zadatak1;

import java.util.Scanner;

public class Palindrom {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj");
		int broj = ulaz.nextInt();
		int originalniBroj = broj;
		int obrnutiBroj=0;
		while(broj>0) {
			int znamenka = broj%10;
			obrnutiBroj= obrnutiBroj*10+znamenka;
			broj/=10;
		}
		if(originalniBroj == obrnutiBroj) {
			System.out.println("Broj je palindrom.");
		}
		else {
			System.out.println("Nije palindrom");
		}
	ulaz.close();	
	}
}
