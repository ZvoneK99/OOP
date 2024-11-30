package zadatak4;

import java.util.Scanner;

public class PretvorbaBroja {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj za pretvorbu u heksadecimalni sustav");
		int broj = ulaz.nextInt();
		
		String hex = Integer.toHexString(broj);
		String HEX = hex.toUpperCase();
		
		System.out.println("Broj u heksimalnom sustavu je: "+HEX);
		ulaz.close();
	}
}
