package Zadatak2;

import java.util.Scanner;

public class BrojParnihNeparnih {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		String uneseniBrojevi = ulaz.nextLine();
		
		String[] odvojeniBrojevi = uneseniBrojevi.split(" ");
		int[] brojeviInt = new int[odvojeniBrojevi.length];
		
		int brojacParnih=0;
		int brojacNeparnih=0;
		
		for(int i=0; i<odvojeniBrojevi.length; i++) {
			brojeviInt[i] = Integer.parseInt(odvojeniBrojevi[i]);
		}
		for(int b : brojeviInt) {
			if(b%2 == 0) {
				brojacParnih++;
			}
			else {
				brojacNeparnih++;
			}
		}
		System.out.println("Broj parnih "+brojacParnih);
		System.out.println("Broj neparnih "+brojacNeparnih);
	}
}
