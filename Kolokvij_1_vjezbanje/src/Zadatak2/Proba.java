package Zadatak2;

import java.util.Scanner;

public class Proba {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice");
		String unos = ulaz.nextLine();
		
		String[] brojevi = unos.split(" ");
		
		int A = Integer.parseInt(brojevi[0]);
		int B = Integer.parseInt(brojevi[1]);
		int C = Integer.parseInt(brojevi[2]);
		
		int kvA = A*A;
		int kvB = B*B;
		int kvC = C*C;
		
		if(kvA == kvB+kvC || kvB == kvA+kvC || kvC == kvA+kvB) {
			System.out.println("DA");
		}
		else {
			System.out.println("NE");
		}
	}
}
