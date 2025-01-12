package Zadatak1;

import java.util.Scanner;

public class AnalizaRecenice {
	public static void main(String[]args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = unos.nextLine();
	
		String[] rijeci = recenica.trim().split("\\s+");
		System.out.println("Broj rijeci u recenici je "+rijeci.length);
		
		String najkracaRijec = rijeci[0];
		String najduzaRijec = rijeci[0];
		int ukupanBrojZnakova=0;
		
		
		for(String rijec : rijeci) {
			if(rijec.length() > najduzaRijec.length()) {
				najduzaRijec = rijec;
			}
			if(rijec.length() < najkracaRijec.length()) {
				najkracaRijec = rijec;
			}
			ukupanBrojZnakova+=rijec.length();
		}
		System.out.println("Najduza rijec: "+najduzaRijec);
		System.out.println("Najkraca rijec: "+najkracaRijec);
		System.out.println("Ukupan broj znakova: "+ukupanBrojZnakova);
		unos.close();
	}
	
}
