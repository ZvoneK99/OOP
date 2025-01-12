package Zadatak1;

import java.util.Scanner;

public class UnosStringa {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite recenicu ");
		String recenica = ulaz.nextLine();
		
		String[] rijeci = recenica.toLowerCase().split(" ");
		String najduzaRijec= "";
		int brojacSamoglasnika=0;
		String obrnutiString = "";
		for(int i=0; i<=rijeci.length-1; i++) {
			if(rijeci[i].length() > najduzaRijec.length()) {
				najduzaRijec = rijeci[i];
			}
		}
		for(int j=rijeci.length-1; j>=0; j--) {
			obrnutiString+=rijeci[j]+" ";
		}
		for(String rijec : rijeci) {
			for(int j=0; j< rijec.length(); j++) {
				char znak = rijec.charAt(j);
				if(znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
					brojacSamoglasnika++;
				}
			}
		}
		System.out.println("Broj rijeci "+rijeci.length);
		System.out.println("Najduza rijec "+najduzaRijec);
		System.out.println("Broj samoglasnika "+brojacSamoglasnika);
		System.out.println("Recenica naopako:  "+obrnutiString);
	}
}
