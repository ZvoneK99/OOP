package while_06;

import java.util.Scanner;
public class while_06 {
	public static void main(String[]args) {
		
	Scanner ulaz = new Scanner(System.in);
	int brojacPozitivnih=0;
	
	while(true) {
		System.out.println("Unesite broj:");
		int broj = ulaz.nextInt();
		
		if(broj!=0) {
			if(broj>0) {
				brojacPozitivnih++;
			}
		}
		else {
			break;
		}
	}
	System.out.println("Broj pozitivnih brojeva je: "+brojacPozitivnih);
	ulaz.close();
	}
}
