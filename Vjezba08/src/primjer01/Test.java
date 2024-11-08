package primjer01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite podatke o učenicima ");
		ArrayList<Učenik> učenici = new ArrayList<>();
		for(int i=0; i<3; i++) {
			System.out.println("Unesite ime: ");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime: ");
			String prezime = ulaz.nextLine();
			ArrayList<Integer> ocjene = new ArrayList<>();
			for(int j=0; j<3; j++) {
				System.out.println("Unesite "+(j+1)+". ocjenu");
				int ocjena = ulaz.nextInt();
				ocjene.add(ocjena);
			}
			

			ulaz.nextLine();
			učenici.add(new Učenik(ime, prezime, ocjene));
		}
		System.out.println("Ispis učenika: ");
		for(Učenik u : učenici) {
			u.ispisiDetalje();
			System.out.println("Prosjek ocjena je: "+u.prosjekOcjena());
		}
		ulaz.close();
	}
}
