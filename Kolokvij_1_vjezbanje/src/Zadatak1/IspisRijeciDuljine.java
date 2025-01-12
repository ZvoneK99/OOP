package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class IspisRijeciDuljine {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<String> rijeci = new ArrayList<>();
		ArrayList<String> trazeneRijeci = new ArrayList<>();
		while(true) {
			System.out.println("Unesite rijec: ");
			String rijec = ulaz.nextLine();
			if(rijec.equalsIgnoreCase("kraj")) {
				break;
			}
			rijeci.add(rijec);
		}
		System.out.println("Rijeci koje duljine zelite da ispisemo? ");
		int duljina = ulaz.nextInt();
		
		for(String rijec : rijeci) {
			if(rijec.length() == duljina) {
				trazeneRijeci.add(rijec);
			}
		}
		System.out.println(trazeneRijeci);
	}
}
