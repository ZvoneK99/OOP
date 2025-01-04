package ZSR2;

import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {
	public static void main(String[]args) {
		int[] nizBrojeva = new int[10];
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0;i<nizBrojeva.length; i++) {
			System.out.println("Unesite broj "+(i+1));
			nizBrojeva[i] = ulaz.nextInt();
		}
		System.out.println("Niz brojeva je: ");
			System.out.println(Arrays.toString(nizBrojeva));
		
		int najveciNeparni = Integer.MIN_VALUE;
		for(int broj : nizBrojeva) {
			if(broj%2 == 1 && broj > najveciNeparni) {
				najveciNeparni = broj;
			}
		}
			
			for(int i=0; i<nizBrojeva.length; i++) {
				if(nizBrojeva[i] % 2 == 1 && i%2 == 0) {
					nizBrojeva[i] = najveciNeparni;
				}
			}
			System.out.println("Izmijenjeni niz brojeva je: ");
	        System.out.println(Arrays.toString(nizBrojeva));
	}
}
