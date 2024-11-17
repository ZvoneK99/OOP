//Je li broj savrsen

package zadatak5;

import java.util.Scanner;

public class SavrseniBroj {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijeli broj.");
		int broj = ulaz.nextInt();
		int originalniBroj = broj;
		int zbrojDjelitelja=0;
		for(int i=1; i<broj; i++) {
			if(broj % i == 0) {
				zbrojDjelitelja+=i;
				
			}
	
		}
		if(originalniBroj==zbrojDjelitelja) {
			System.out.println("Broj je savrsen.");
		}
		else {
			System.out.println("Broj nije savrsen.");
		}
	}
}
