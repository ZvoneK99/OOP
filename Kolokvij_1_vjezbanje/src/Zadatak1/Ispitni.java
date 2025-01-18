package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ispitni {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<String> rijeci = new ArrayList<>();
		int ukupanBrojZnakova=0;
		while(ukupanBrojZnakova<50) {
			System.out.println("Unesite string");
			String rijec = ulaz.nextLine();
			rijeci.add(rijec);
			ukupanBrojZnakova+=rijec.length();
		}
		
		for(String rijec : rijeci) {
			if(jeLiPalindrom(rijec)) {
				System.out.println(rijec);
			}
		}
	}
	
	public static boolean jeLiPalindrom(String rijec) {
		
		rijec = rijec.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String obrnutiString = new StringBuilder(rijec).reverse().toString();
		return rijec.equals(obrnutiString);
	}
}
