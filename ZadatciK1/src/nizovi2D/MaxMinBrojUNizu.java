package nizovi2D;

import java.util.Scanner;

public class MaxMinBrojUNizu {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite u nizu.");
		int n = ulaz.nextInt();
		int[] brojevi = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Unesite broj "+(i+1)+" u niz:");
			int broj = ulaz.nextInt();
			brojevi[i] = broj;
		}
		System.out.println("Elementi niza su: ");
		for(int broj : brojevi) {
			System.out.println(broj);
		}
		
		//Pronalazak najvećeg i najmanjeg u nizu
		int max = brojevi[0];
		int min = brojevi[0];
		for(int broj : brojevi) {
			if(broj>max) max = broj;
			if(broj<min) min = broj;
		}
		System.out.println("Najveći broj u nizu je: "+max);
		System.out.println("Najmanji broj u nizu je: "+min);
		ulaz.close();
	}
}
