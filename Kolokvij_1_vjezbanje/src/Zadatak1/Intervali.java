package Zadatak1;

import java.util.Scanner;

public class Intervali {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite donju granicu ");
		int donjaGranica = ulaz.nextInt();
		
		System.out.println("Unesite gornju granicu");
		int gornjaGranica = ulaz.nextInt();
		
		if(donjaGranica>=gornjaGranica) {
			System.out.println("Donja granica mora biti manja od gornje granice.");
		}
		else {
			for(int broj=donjaGranica; broj<=gornjaGranica; broj++) {
				if(jeLiSavrsen(broj)) {
					System.out.println(broj+" ");
				}
			}
		}
	}
	
	public static boolean jeLiSavrsen(int broj) {
		broj = Math.abs(broj);
		int zbrojDjelitelja=0;
		for(int i=1; i<broj; i++) {
			if(broj % i == 0) {
				zbrojDjelitelja+=i;
			}
		}
		if(zbrojDjelitelja==broj) {
			return true;
		}
		else {
			return false;
		}
	}
}
