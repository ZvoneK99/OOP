package Zadatak1;

import java.util.Scanner;

public class SavrsenBroj {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		broj = Math.abs(broj);

		int zbrojFaktora = 0;
		for(int i=1; i<broj; i++) {
			if(broj%i == 0) {
				zbrojFaktora+=i;
			}
		}
		if(zbrojFaktora == broj) {
			System.out.println("Broj je savrsen.");
		}
		else {
			System.out.println("Broj nije savrsen.");
		}
		ulaz.close();
	}
	
	
}
