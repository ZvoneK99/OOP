//Korisnkik unese broj pa ispisujemo zbroj parnih od 1 do tog broja
package while_04;

import java.util.Scanner;

public class while_04 {

	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int n = ulaz.nextInt();
		int broj = 1;
		int zbroj = 0;
		while(broj<=n) {
			if(broj%2==0) {
				zbroj+=broj;
			}
			broj++;
		}
		System.out.println("Zbroj parnih brojeva je: "+zbroj);
		ulaz.close();
	}
}
