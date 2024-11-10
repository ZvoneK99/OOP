package zadatak1;

import java.util.Scanner;

public class Email {
	public static boolean provjeriEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		return email.matches(emailRegex);
	}
	
	public static void main (String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite Vaš email: ");
		String uneseniEmail = ulaz.nextLine();
		boolean provjeraMaila = provjeriEmail(uneseniEmail);
		if(provjeraMaila) {
			System.out.println("Vaš Email je ispravan");
		}
		else {
			System.out.println("Vaš Email nije ispravan.");
		}
	ulaz.close();
	}
	
}


