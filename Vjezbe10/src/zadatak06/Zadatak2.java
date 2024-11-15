package zadatak06;

import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice trokuta odvojene razmakom: ");
		String input = ulaz.nextLine();
		
		String[] brojevi = input.split(" ");
		
		double a = Double.parseDouble(brojevi[0]);
		double b = Double.parseDouble(brojevi[1]);
		double c = Double.parseDouble(brojevi[2]);
		
		System.out.println("Unijeli ste brojeve: "+a+" "+b+" "+c+".");
		double kvadratA = a*a;
		double kvadratB = b*b;
		double kvadratC = c*c;
		System.out.println("Kvadrati tih brojeva su: ");
		System.out.println(kvadratA);
		System.out.println(kvadratB);
		System.out.println(kvadratC);
		
		if(kvadratA == kvadratB+kvadratC || kvadratB == kvadratA+kvadratC || kvadratC == kvadratA+kvadratB) {
			System.out.println("Trokut je pravokutan");
		}
		else {
			System.out.println("Trokut nije pravokutan.");
		}
	}
}
