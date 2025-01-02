package Zadatak2;

import java.util.Scanner;

public class ProsjekSuma {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		String uneseniBrojevi = ulaz.nextLine();
		
		String[] brojevi = uneseniBrojevi.split(" ");
		
		int[] brojeviInt = new int[brojevi.length];
		
		for(int i=0; i<brojevi.length; i++) {
			brojeviInt[i] = Integer.parseInt(brojevi[i]);
		}
		int suma=0;
		double prosjek=0;
		
		for(int b : brojeviInt) {
			suma+=b;
		}
		prosjek=suma/brojeviInt.length;
		System.out.println("suma "+suma);
		System.out.println("Prosjek: "+prosjek);
		ulaz.close();
	}
	
}
