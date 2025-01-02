package Zadatak2;

import java.util.Scanner;

public class Pravokutan {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice trokuta odvojene razmakom.");
		String stranice = ulaz.nextLine();
		
		String[] brojevi = stranice.split(" ");
		int stranicaA = Integer.parseInt(brojevi[0]);
		int stranicaB = Integer.parseInt(brojevi[1]);
		int stranicaC = Integer.parseInt(brojevi[2]);
		
		int kvadratA = stranicaA*stranicaA;
		int kvadratB = stranicaB*stranicaB;
		int kvadratC = stranicaC*stranicaC;
		
		if(kvadratA == kvadratB+kvadratC || kvadratB == kvadratA+kvadratC || kvadratC == kvadratA+kvadratB) {
			System.out.print("DA");
		}
		else {
			System.out.println("NE");
		}
	}
}
