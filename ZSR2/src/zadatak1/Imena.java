package zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Imena {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<String> prviNiz = new ArrayList<>();
		ArrayList<String> drugiNiz = new ArrayList<>();
		String[] imena = new String[10];
		for(int i=0; i<imena.length; i++) {
			System.out.println("Unesite "+(i+1)+". ime.");
			String unosImena = ulaz.nextLine();
			
			String ime = unosImena.toLowerCase();
			
			imena[i] = ime;
			if(ime.charAt(0) == ime.charAt(ime.length()-1)) {
				prviNiz.add(ime);
			}
			else {
				drugiNiz.add(ime);
			}
		}
		System.out.println("Imena kojima je prvo slovo jednako zadnjemu:");
		for(String ime : prviNiz) {
			System.out.println(ime);
		}
		
		System.out.println("-------------------------------");
		System.out.println("Imena kojima je prvo slovo razlicito od zadnjega: ");
		for(String ime : drugiNiz) {
			System.out.println(ime);
		}
		
		ulaz.close();
	}
}
