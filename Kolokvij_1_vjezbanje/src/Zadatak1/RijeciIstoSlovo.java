package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class RijeciIstoSlovo {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<String> rijeci = new ArrayList<>();
		ArrayList<String> isteRijeci = new ArrayList<>();
		while(true) {
			System.out.println("Unesite rijec ");
			String rijec = ulaz.nextLine();
			if(rijec.equalsIgnoreCase("kraj")) {
				break;
			}
			rijeci.add(rijec);
		}
		String prvaRijec = rijeci.get(0);
		char prvoSlovo = prvaRijec.charAt(0);
		
		for(String rijec : rijeci) {
			char zadnjeSlovo = rijec.charAt(rijec.length()-1);
			if(zadnjeSlovo == prvoSlovo) {
				isteRijeci.add(rijec);
			}
		}
		System.out.println("Pocetna rijec: "+prvaRijec);
		System.out.println("Prvo slovo prve rijeci: "+prvoSlovo);
		System.out.println("Rijeci koje trazimo su: "+isteRijeci);
	}
}
