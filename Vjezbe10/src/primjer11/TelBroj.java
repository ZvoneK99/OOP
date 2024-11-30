package primjer11;

import java.util.Scanner;

public class TelBroj {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite postanski sanducic broj za provjeru.");
		String broj = ulaz.nextLine();
		
		String zadovoljavajuciBroj = "^[0-9]{5}([-][0-9]{4})?$";

		
		if(broj.matches(zadovoljavajuciBroj)) {
			System.out.println("Broj je zadovoljavajuc.");
		}
		else {
			System.out.println("Broj nije zadovoljavajuc.");
		}
	}
}
