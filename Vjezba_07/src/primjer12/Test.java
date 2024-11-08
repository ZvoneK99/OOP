package primjer12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	ArrayList<Zaposlenik> zaposlenici;
	
	public Test() {
		this.zaposlenici = new ArrayList<>();
	}
	public static void main(String[]args) {
			System.out.println("Unesite podatke o zaposlenicima");
			
			for(int i=0; i<5; i++) {
				Scanner ulaz = new Scanner(System.in);
				System.out.println("Unesite ime zaposlenika: ");
				String ime = ulaz.nextLine();
				
				System.out.println("Unesite prezime zaposlenika: ");
				String prezime = ulaz.nextLine();
				
				System.out.println("Unesite datum rođenja: ");
				int datumRođenja = ulaz.nextInt();
			}
	}
}
