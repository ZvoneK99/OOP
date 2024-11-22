package primjer02;

import java.util.ArrayList;

public class ObradaBrojeva {
	public static void main(String[]args) {
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			brojevi.add(i);
		}
		//Parni i neparni brojevi
		for(int b : brojevi) {
			if(b%2==0) {
				System.out.println(b+" Paran broj.");
			}
			else {
				System.out.println(b+" Neparan broj.");
			}
		}
		//Najjveci i najmanji broj
		int najveciBroj = brojevi.get(0);
		int najmanjiBroj = brojevi.get(0);
		for(int broj : brojevi) {
			if(broj>najveciBroj) {
				najveciBroj = broj;
			}
			if(broj<najmanjiBroj) {
				najmanjiBroj = broj;
			}
		}
		System.out.println(najveciBroj);
		System.out.println(najmanjiBroj);
	}
}
