package Zadatak1;

import java.util.Scanner;

public class PrijateljskiBrojevi {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 1.broj");
		int broj1 = ulaz.nextInt();
		
		System.out.println("Unesite 2. broj");
		int broj2 = ulaz.nextInt();
		
		int zbrojFaktora1 = 0;
		int zbrojFaktora2 = 0;
		
		for(int i=1; i<broj1; i++) {
			if (broj1%i == 0) {
				zbrojFaktora1 += i;
			}
		}
		for(int i=1; i<broj2; i++) {
			if(broj2%i == 0) {
				zbrojFaktora2 += i;
			}
		}
		if(broj1 == zbrojFaktora2 && broj2 == zbrojFaktora1) {
			System.out.println("Brojevi su prijateljski");
		}
		else {
			System.out.println("Brojevi nisu prijateljski");
		}
		ulaz.close();
	}
}
