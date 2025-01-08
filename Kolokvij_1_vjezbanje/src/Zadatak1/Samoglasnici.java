package Zadatak1;

import java.util.Scanner;

public class Samoglasnici {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenicaUnos = ulaz.nextLine();
		
		String recenica = recenicaUnos.toLowerCase();
		int brojacSamoglasnika = 0;
		
		for(int i=0; i<recenica.length(); i++) {
			if(recenica.charAt(i) == 'a') {
				brojacSamoglasnika++;
			}
		}
		System.out.println(brojacSamoglasnika);
	}
}
