package Zadatak2;

import java.util.Scanner;

public class Cetverokut {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice četverokuta odvojene razmakom.");
		String unos = ulaz.nextLine();
		
		String[] brojevi = unos.split(" ");
		
		if(brojevi.length != 4) {
			System.out.println("Niste unijeli 4 broja.");
			return;
		}
		int stranicaA = Integer.parseInt(brojevi[0]);
		int stranicaB = Integer.parseInt(brojevi[1]);
		int stranicaC = Integer.parseInt(brojevi[2]);
		int stranicaD = Integer.parseInt(brojevi[3]);
		
		int kvadratA = stranicaA*stranicaA;
		int kvadratB = stranicaB*stranicaB;
		int kvadratC = stranicaC*stranicaC;
		int kvadratD = stranicaD*stranicaD;
		
		double d1 = Math.sqrt(kvadratA+kvadratB);
		double d2 = Math.sqrt(kvadratC+kvadratD);
		
		if(d1 == d2) {
			System.out.println("Četverokut je pravokutan.");
		}
		else {
			System.out.println("Četverokut nije pravokutan.");
		}
	}
}
