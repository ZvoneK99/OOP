package nizovi2D;

import java.util.Scanner;

public class ZbrajanjeElemenataNiza {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj clanova u nizu.");
		int n = ulaz.nextInt();
		
		int[] brojevi = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Unesite "+(i+1)+" element niza:");
			int broj = ulaz.nextInt();
			
			brojevi[i] = broj;
			
		}
		int zbroj=0;
		for(int broj : brojevi) {
			zbroj+=broj;
		}
		System.out.println("Zbroj brojeva je: "+zbroj);
		ulaz.close();
	}
}
