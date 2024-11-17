//Ispisi najveci zajednicki djelitelj NZD

package zadatak5;

import java.util.Scanner;

public class NZD {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dva broja odvojena razmakom.");
		String input = ulaz.nextLine();
		
		String[] brojevi = input.split(" ");
		
		int broj1 = Integer.parseInt(brojevi[0]);
		int broj2 = Integer.parseInt(brojevi[1]);
		while (broj2 != 0) {
		    int temp = broj2;
		    broj2 = broj1 % broj2;
		    broj1 = temp;
		}
		System.out.println("Najveći zajednički djelitelj je: " + broj1);
ulaz.close();
	}

}
	/*	int NZD = 1;
		
		//Pronalazak manjeg broja
		int manjiBroj=0;
		if(broj1<broj2) {
			 manjiBroj = broj1;
		}
		else if(broj1>broj2) {
			manjiBroj = broj2;
		}
		else {
			manjiBroj = broj1 = broj2;
		}
		for(int i=1; i<=manjiBroj; i++) {
			if(broj1%i == 0 && broj2%i == 0) {
				NZD=i;
			}
		}
		System.out.print("Najveći zajednički djelitelj brojeva "+broj1+" i "+broj2+" je broj "+NZD);
	}
}*/

/*mogao sam pomoću Euklidovog poučka
 * 
 * while (broj2 != 0) {
    int temp = broj2;
    broj2 = broj1 % broj2;
    broj1 = temp;
}
System.out.println("Najveći zajednički djelitelj je: " + broj1);
*/
