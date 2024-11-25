package zadatak1novo;

import java.util.Scanner;

public class ProvjeriEmail {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vas postanski broj:");
		String broj = ulaz.nextLine();
		
		String regex = "^[0-9]{3}[ -]?[0-9]{2}$";
		
		if(broj.matches(regex)) {
			System.out.println("Broj je ispravan.");
		}
		else {
			System.out.println("Broj nije ispravan");
		}
		ulaz.close();
	}
	
}
