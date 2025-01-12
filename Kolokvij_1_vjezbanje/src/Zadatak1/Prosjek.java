package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prosjek {
	public static void main(UnosStringa[]args) {
		
		ArrayList<Integer> brojevi = new ArrayList<>();
		Scanner ulaz= new Scanner(System.in);
		while(true) {
			System.out.println("Unesite brojeve");
			int broj = ulaz.nextInt();
		if(broj == 0) {
			break;
		}
		brojevi.add(broj);
		}
		int najveciBroj = Integer.MIN_VALUE;
		int najmanjiBroj = Integer.MAX_VALUE;
		int zbrojBrojeva = 0;
		double prosjek = 0;
		for(int br : brojevi) {
			zbrojBrojeva += br;
		if(br>najveciBroj) {
			najveciBroj = br;
		}
		if(br<najmanjiBroj) {
			najmanjiBroj = br;
		}
		}
		prosjek = (double) zbrojBrojeva/brojevi.size();
		System.out.println(prosjek);
		System.out.println(najveciBroj);
		System.out.println(najmanjiBroj);
	}
}
