package zadatak1novo;

import java.util.Scanner;

public class ProvjeriEmail {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vas postanski broj:");
		String broj = ulaz.nextLine();
		
		String regex = "^[a-zA-Z][a-zA-Z0-9._]{2,}[a-zA-Z0-9]@[a-zA-Z0-9]+\\.(com|net|org)$";

		
		if(broj.matches(regex)) {
			System.out.println("Broj je ispravan.");
		}
		else {
			System.out.println("Broj nije ispravan");
		}
		ulaz.close();
	}
	
}
