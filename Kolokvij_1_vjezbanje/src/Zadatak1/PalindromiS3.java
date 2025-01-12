package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromiS3 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<String> rijeci = new ArrayList<>();
		ArrayList<String> palindromi = new ArrayList<>();
		ArrayList<String> palindromiSa3 = new ArrayList<>();
		for(int i=0; i<10; i++) {
			System.out.println("Unesite "+(i+1)+" rijec ");
			String rijec = ulaz.nextLine();
			rijeci.add(rijec);
		}
		for(String r : rijeci) {
			if(jeLiPalindrom(r)) {
				palindromi.add(r);
			}
		}
		for(String s : palindromi) {
			if(s.length() == 3) {
				palindromiSa3.add(s);
			}
		}
		System.out.println("Palindromi od 3 slova su: "+palindromiSa3);
		ulaz.close();
	}
	
	public static boolean jeLiPalindrom(String rijec) {
		rijec = rijec.toLowerCase();
		String obrnutiString="";
		for(int i=rijec.length()-1; i>=0; i--) {
			obrnutiString+=rijec.charAt(i);
		}
		if(obrnutiString.equals(rijec)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
