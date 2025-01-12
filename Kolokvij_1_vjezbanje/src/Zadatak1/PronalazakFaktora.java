package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class PronalazakFaktora {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = ulaz.nextInt();
		ArrayList<Integer> faktori = new ArrayList<>();
		broj = Math.abs(broj);
		for(int i=1;i <=broj; i++) {
			if(broj%i == 0) {
				faktori.add(i);
			}
		}
		System.out.println("Faktori su: "+faktori);
		ulaz.close();
	}
}
