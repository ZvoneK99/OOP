package Zadatak2;

import java.util.Scanner;

public class najveciBroj {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve za usporedbu.");
		String brojevi = ulaz.nextLine();
		
		String[] broj = brojevi.split(" ");
		int[]  brojeviInt = new int[broj.length];

		for(int i=0; i<broj.length; i++) {
			brojeviInt[i] = Integer.parseInt(broj[i]);
		}
		int max = brojeviInt[0];
		for(int b : brojeviInt) {
			if (b>max) {
				max = b;
			}
		}
		System.out.println("naj je" +max);
		}
}
