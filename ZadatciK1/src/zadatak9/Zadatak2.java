package zadatak9;

import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice trokuta odvojene razmakom.");
		String stranice = ulaz.nextLine();
		
		String[] dijelovi = stranice.split(" ");
		int a = Integer.parseInt(dijelovi[0]);
		int b = Integer.parseInt(dijelovi[1]);
		int c = Integer.parseInt(dijelovi[2]);
		
		int kvadratA = a*a;
		int kvadratB = b*b;
		int kvadratC = c*c;
		
		if(kvadratC == kvadratA+kvadratB || kvadratB == kvadratA+kvadratC || kvadratA == kvadratB+kvadratC) {
			System.out.println("Trokut je pravokutan.");
		}
		else {
			System.out.println("Trokut nije pravokutan.");
		}
		ulaz.close();
	}
}
