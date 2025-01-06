package Zadatak1;

import java.util.Scanner;

public class Zadatak1_3 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj.");
		int broj = ulaz.nextInt();
		
		String br = String.valueOf(broj);
		boolean jePalindrom = true;
		
		int i=0; 
		int j=br.length()-1;

		while(i<j) {
			if(br.charAt(i) != br.charAt(j)) {
				jePalindrom = false;
				break;
			}
			i++;
			j--;
		}
		if(jePalindrom) {
			System.out.println("Je palindrom.");
		}
		else {
			System.out.println("Nije palindrom.");
		}
		ulaz.close();
	}
}
