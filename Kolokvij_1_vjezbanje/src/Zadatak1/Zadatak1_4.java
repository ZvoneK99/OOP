package Zadatak1;

import java.util.Scanner;

public class Zadatak1_4 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj.");
		int broj=ulaz.nextInt();
		
		String br = String.valueOf(broj);
		String naopako = "";
		for(int i=br.length()-1; i>=0; i--) {
			naopako+= br.charAt(i);
		}
		naopako = String.valueOf(Integer.parseInt(naopako));
		System.out.println(naopako);
		ulaz.close();
	}
}
