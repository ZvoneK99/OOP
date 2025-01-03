package ZSR1;

import java.util.Scanner;

public class IspravnostEmaila {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite email adresu ");
		String unos = ulaz.nextLine();
		
		String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.+[a-zA-Z]{2,}$";
		
		if(unos.matches(regex)) {
			System.out.println("Email adresa je ispravna.");
		}
		else {
			System.out.println("Email adresa nije ispravna.");
		}
		ulaz.close();
	}
}
