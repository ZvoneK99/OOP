//korisnik unosi brojeve dok se ne unese 0;	ispisujemo zbroj brojeva

package while_01;

import java.util.Scanner;

public class while_01 {
	public static void main(String[]args) {
		int zbroj=0;
		Scanner ulaz = new Scanner(System.in);

		int broj;
		
		while(true) {
			System.out.println("Unesite broj: ");
			broj = ulaz.nextInt();
		
			if(broj==0) {
				break;
			}
			zbroj+=broj;
		}
		System.out.println("Zbroj brojeva je: "+zbroj);
		ulaz.close();
	}
}
