package zadatak2;

import java.util.Scanner;

public class TelefonskiBroj {
	
	public static boolean jeLiBrojIspravan(String broj) {
		String regex = "^\\+\\d{3}-\\d{3}-\\d{4}$";
		return broj.matches(regex);
	}
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		String broj = ulaz.nextLine();
		
		if(jeLiBrojIspravan(broj)) {
			System.out.println("Broj je ispravan.");
		}
		else  {
			System.out.println("Broj nije ispravan.");
		}
		ulaz.close();
	}
	
}
