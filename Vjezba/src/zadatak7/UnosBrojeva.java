package zadatak7;

import java.util.ArrayList;
import java.util.Scanner;

public class UnosBrojeva {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Integer> brojevi = new ArrayList<>();
		System.out.println("Koliko brojeva ćete unositi u listu? ");
		int n = ulaz.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Unesite "+(i+1)+" broj:");
			int broj = ulaz.nextInt();
			
			brojevi.add(broj);
		}
		int najveci = brojevi.get(0);
		int najmanji = brojevi.get(0);
		double zbroj=0;
		double prosjek = 1;
		int brojacPozitivnih=0;
		int brojacNegativnih=0;
		int brojacNula=0;
		
		//Max
		for(Integer i : brojevi) {
			zbroj+=i;
			if(i>najveci) {
				najveci = i;
			}
			if(i<najmanji) {
				najmanji = i;
			}
			if(i>0) {
				brojacPozitivnih++;
			}
			else if(i<0) {
				brojacNegativnih++;
			}
			else {
				brojacNula++;
			}
		}
		prosjek = zbroj / brojevi.size();
		System.out.println("Najveći broj: "+najveci);
		System.out.println("Najmanji broj:"+najmanji);
		System.out.println("Broj pozitivnih: "+brojacPozitivnih);
		System.out.println("Broj negativnih: "+brojacNegativnih);
		System.out.println("Broj nula: "+brojacNula);
		System.out.println("Prosjek: "+prosjek);

	}
}
