package Zadatak2;

import java.util.Scanner;

public class glavni {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj");
		String brojeviSkupa = ulaz.nextLine();
		
		String[] brojevi = brojeviSkupa.split(" ");
		
		int stranicaA = Integer.parseInt(brojevi[0]);
		int stranicaB = Integer.parseInt(brojevi[1]);
		int stranicaC = Integer.parseInt(brojevi[2]);
		
		int kvadratA = stranicaA*stranicaA;
		int kvadratB = stranicaB*stranicaB;
		int kvadratC = stranicaC*stranicaC;
		
		if(kvadratA == kvadratB+kvadratC || kvadratB == kvadratA+kvadratC || kvadratC == kvadratA+kvadratB) {
			System.out.println("Trokut je pravokutan.");
		}
		else {
			System.out.println("Trokut nije pravokutan.");
		}
	}
}
