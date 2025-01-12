package Zadatak1;

import java.util.Scanner;

public class ProstBroj {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
	
		if(jeLiProst(broj)) {
			System.out.println("Broj je prost");
		}
		else {
			System.out.println("Broj nije prost");
		}
	}
	
	
	
	static boolean jeLiProst(int broj) {
		
		if(broj<2) {
			return false;
		}
		for(int i=2; i<= Math.sqrt(broj); i++) {
			if(broj % i == 0) {
				return false;
			}
			}
		return true;
		}
		
	}
